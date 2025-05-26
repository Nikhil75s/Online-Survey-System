
# 📝 Online Survey System

## Overview

The **Online Survey System** is a Java-based console application designed to streamline the creation, deployment, and analysis of surveys using a relational database backend. Developed as part of our B.Tech project at **SRM Institute of Science & Technology**, this system focuses on simplicity, scalability, and secure data handling using **Java**, **JDBC**, and **Oracle SQL**.

## 🔧 Features

- ✅ Create surveys dynamically with multiple questions
- ✅ Securely collect and store user responses
- ✅ Retrieve and view results with clear structure
- ✅ Robust Oracle SQL database integration
- ✅ Object-oriented Java codebase with JDBC

## 📽️ Demo (Console Preview)

```bash
Survey System Menu:
1. Create a Survey
2. Take a Survey
3. View Survey Results
4. Exit
```

## 🧑‍💻 Tech Stack

- **Programming Language:** Java (JDK 8+)
- **Database:** Oracle SQL (Oracle XE 11g or later)
- **Connectivity:** JDBC (ojdbc8.jar or higher)
- **IDE Support:** Eclipse / IntelliJ IDEA / NetBeans

## 📁 Project Structure

```
/OnlineSurveySystem
│
├── Main.java              # Entry point of the application
├── SurveySystem.java      # Core logic for survey handling
├── Oracle DB Schema       # Surveys, Questions, Responses tables
└── README.md              # Project documentation
```

## 🗃️ Database Schema

- **surveys**: `id`, `title`
- **questions**: `id`, `survey_id`, `question_text`
- **responses**: `id`, `question_id`, `response_text`

## ⚙️ How to Run

1. Ensure **Oracle SQL** and **JDK 8+** are installed.
2. Configure Oracle DB connection in `SurveySystem.java`.
3. Compile and run:
   ```bash
   javac Main.java
   java Main
   ```

## ✅ Advantages

- Real-time data capture
- High data integrity and security using SQL transactions
- Cost-effective and error-minimizing automation
- Scalable architecture for survey expansion

## ⚠️ Limitations

- Console-based UI (no GUI or web interface)
- No support for complex question types (MCQs, ratings)
- Single-user role with no authentication
- Tied to Oracle DB (not yet portable to other DBs)

## 🚀 Future Enhancements

- GUI/web-based interface
- Support for multiple question types
- User role management and login system
- Visualization of survey results with charts
- Cross-platform database support

## 👨‍🏫 Authors

- Yash Negi 
- Shlok Saxena 
- Nikhil Sharma
- Ankit Tehri

**Under the guidance of**  
_Mr. Himanshu_  
Assistant Professor, Department of CSE

## 📚 References

1.	Deitel, H., & Deitel, P. (2017). Java: How to Program (Late Objects). Pearson Education.

2.	Horstmann, C. S., & Cornell, G. (2019). Core Java Volume I—Fundamentals. Pearson Education.

3.	Silberschatz, A., Korth, H. F., & Sudarshan, S. (2020). Database System Concepts. McGraw-Hill Education.
.
4.	Pratt, P. J., & Adamski, J. J. (2018). Concepts of Database Management. Cengage Learning.

5.	Burd, B. (2020). Beginning Programming with Java For Dummies. Wiley.

6.	Oracle Corporation. (2024). Java Database Connectivity (JDBC) Developer's Guide. Oracle Corporation.

7.	Oracle Corporation. (2024). Oracle SQL Developer User's Guide. Oracle Corporation.

8.	Fowler, M. (2002). Patterns of Enterprise Application Architecture. Addison-Wesley.

9.	Nielsen, J. (1994). Usability Engineering. Academic Press.

10.	Pressman, R. S., & Maxim, B. R. (2020). Software Engineering: A Practitioner's Approach. McGraw-Hill Education.
