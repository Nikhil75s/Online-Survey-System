package dao;
import beans.Question;
import beans.Topic;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList; 

public class TopicDAO { 
    public static ArrayList<Topic> getTopics() {
        try {
            Connection con = Database.getConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM topics ORDER BY topictitle");
            ArrayList<Topic> topicList = new ArrayList<>();
            while (rs.next()) {
                topicList.add(new Topic(rs.getString("topicid"), rs.getString("topictitle")));
            }
            rs.close();
            return topicList;
        } catch (Exception e) {
            System.out.println("Error in TopicDAO.getTopics() -->" + e.getMessage());
            return null;
        }
    } 

    public static ArrayList<Question> getQuestions(String topicId) {
        try {
            Connection con = Database.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM questions WHERE topicid = ? ORDER BY questionid");
            ps.setString(1, topicId);
            ResultSet rs = ps.executeQuery();
            ArrayList<Question> questionList = new ArrayList<>();
            while (rs.next()) {
                questionList.add(new Question(rs.getString("questionid"), rs.getString("questiontext"), rs.getString("opt1"), rs.getString("opt2"), rs.getString("opt3")));
            }
            rs.close();
            return questionList;
        } catch (Exception e) {
            System.out.println("Error in TopicDAO.getQuestions() -->" + e.getMessage());
            return null;
        }
    } 

    public static boolean storeSurveyResults(String topicId, ArrayList<Question> questions) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement("INSERT INTO answers_master VALUES (surveyid_sequence.nextval, ?, sysdate)");
            ps.setString(1, topicId); 
            ps.executeUpdate();

            ps = con.prepareStatement("INSERT INTO answers_details VALUES (surveyid_sequence.currval, ?, ?)");
            for (Question q : questions) {
                ps.setString(1, q.getId());
                ps.setString(2, q.getAnswer());
                ps.executeUpdate();
            }

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error in TopicDAO.storeSurveyResults() -->" + e.getMessage());
            if (con != null) {
                try {
                    con.rollback();
                } catch (Exception ex) {
                    System.out.println("Rollback failed -->" + ex.getMessage());
                }
            }
            return false;
        } finally {
            Database.close(con);
        }
    }
}
