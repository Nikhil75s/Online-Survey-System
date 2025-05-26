
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

- Yash Negi – [RA2311056030009]
- Shlok Saxena – [RA2311056030029]
- Nikhil Sharma – [RA2311056030043]
- Ankit Tehri – [RA2311056030057]

**Under the guidance of**  
_Mr. Himanshu_  
Assistant Professor, Department of CSE

## 📚 References

See full references in the [project report](./Online Survey system.docx). Includes books like *Java How to Program*, *Core Java*, *Database System Concepts*, and official Oracle documentation.

## 📜 License

This project is developed for academic purposes. For reuse or collaboration, please contact the authors.
