**JDBC CRUD Demo** 🚀
=====================

A simple **JDBC (Java Database Connectivity) demo** project that implements **CRUD (Create, Read, Update, Delete) operations** using **MySQL Workbench** and Java. The project is pushed to **GitHub via Terminal** and utilizes **MySQL Connector 8.4.0** for database interaction.

* * * * *

📌 **Project Features**
-----------------------

✔️ Connect Java with **MySQL Workbench** using JDBC\
✔️ Perform **CRUD operations** (Create, Read, Update, Delete) on a MySQL database\
✔️ Use **Prepared Statements** to prevent SQL injection\
✔️ Manage database connection efficiently with best practices\
✔️ Work with **MySQL Connector J 8.4.0** for JDBC

* * * * *

🛠 **Technologies Used**
------------------------

-   **Java** (JDK 17+)
-   **JDBC (Java Database Connectivity)**
-   **MySQL Workbench**
-   **MySQL Connector J 8.4.0**
-   **Git** (Version Control via Terminal)


* * * * *

🔗 **Database Configuration**
-----------------------------

1.  Install **MySQL Workbench** and create a database (e.g., `jdbc_demo`).
2.  Create a **users** table in MySQL:

    ```
    CREATE TABLE users (
        id INT PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(100),
        email VARCHAR(100) UNIQUE
    );

    ```

3.  Update your **JDBC URL, username, and password** in `DatabaseConnection.java`:

    ```
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    ```

* * * * *

🚀 **How to Run**
-----------------

### **1\. Clone the Repository**

```
git clone https://github.com/your-username/jdbc-demo.git
cd jdbc-demo

```

### **2\. Compile and Run the Project**

Make sure **mysql-connector-j-8.4.0.jar** is in the `lib` folder.

#### **For Windows (Command Prompt)**

```
javac -cp ".;lib/mysql-connector-j-8.4.0.jar" src/*.java
java -cp ".;lib/mysql-connector-j-8.4.0.jar" src.Main

```

#### **For Linux/Mac (Terminal)**

```
javac -cp ".:lib/mysql-connector-j-8.4.0.jar" src/*.java
java -cp ".:lib/mysql-connector-j-8.4.0.jar" src.Main

```

* * * * *

🛠 **CRUD Operations Example**
------------------------------

### **Insert Data (Create)**

```
String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, "Alice");
pstmt.setString(2, "alice@example.com");
pstmt.executeUpdate();

```

### **Retrieve Data (Read)**

```
String sql = "SELECT * FROM users";
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(sql);
while (rs.next()) {
    System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
}

```

*(Similar code for Update and Delete in `CrudOperations.java`)*

* * * * *

🎯 **Git Commands Used (via Terminal)**
---------------------------------------

### **Initialize Git & Push Project to GitHub**

```
git init
git add .
git commit -m "Initial commit - JDBC CRUD demo"
git remote add origin https://github.com/your-username/jdbc-demo.git
git push -u origin main

```

* * * * *

📜 **License**
--------------

This project is **free to use** for learning purposes.

* * * * *

### 🌟 **Contributions & Feedback**

Feel free to **fork**, **improve**, or **open issues** if you have any suggestions! 🙌
