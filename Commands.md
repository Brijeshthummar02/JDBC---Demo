**🚀 MySQL CRUD Operations & Workbench Guide**
==============================================

This guide covers:\
✅ **Full CRUD Operations (Terminal Commands)**\
✅ **How to Log In via MySQL Workbench**

* * * * *

**1️⃣ Log In to MySQL (Terminal)**
----------------------------------

Run the following command in your terminal:

```
mysql -u root -p

```

🔹 **`-u root`** → Specifies the MySQL **username** (change it if needed).\
🔹 **`-p`** → Prompts for the **password** (enter your MySQL password when asked).

* * * * *

**2️⃣ Create a Database**
-------------------------

```
CREATE DATABASE jdbc_demo;

```

💡 This creates a **new database** for the project.

* * * * *

**3️⃣ Select the Database**
---------------------------

```
USE jdbc_demo;

```

💡 Switches to **`jdbc_demo`** as the active database.

* * * * *

**4️⃣ Create a Table (`users`)**
--------------------------------

```
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    age INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

```

💡 **Fields:**

-   `id`: Auto-incrementing **primary key**
-   `name`: Stores the **user's name**
-   `email`: Stores a **unique email**
-   `age`: Stores the **user's age**
-   `created_at`: Stores **timestamp** when the record was created

* * * * *

**5️⃣ Insert Data (CREATE)**
----------------------------

```
INSERT INTO users (name, email, age) VALUES
('Alice', 'alice@example.com', 25),
('Bob', 'bob@example.com', 30),
('Charlie', 'charlie@example.com', 22);

```

💡 Adds **3 users** to the database.

* * * * *

**6️⃣ Retrieve Data (READ)**
----------------------------

### 🔹 **Retrieve All Users**

```
SELECT * FROM users;

```

💡 Shows **all records** in the `users` table.

### 🔹 **Retrieve a Specific User**

```
SELECT * FROM users WHERE name = 'Alice';

```

💡 Gets details of **Alice** only.

### 🔹 **Retrieve Users Older Than 25**

```
SELECT * FROM users WHERE age > 25;

```

💡 Filters users **older than 25**.

* * * * *

**7️⃣ Update Data (UPDATE)**
----------------------------

### 🔹 **Update a User's Email**

```
UPDATE users SET email = 'alice.new@example.com' WHERE name = 'Alice';

```

💡 Updates **Alice's email**.

### 🔹 **Increase Age for All Users by 1**

```
UPDATE users SET age = age + 1;

```

💡 Increments **age for all users**.

* * * * *

**8️⃣ Delete Data (DELETE)**
----------------------------

### 🔹 **Delete a Specific User**

```
DELETE FROM users WHERE name = 'Bob';

```

💡 Removes **Bob** from the database.

### 🔹 **Delete All Users (⚠️ Use with Caution!)**

```
DELETE FROM users;

```

💡 Clears **all data** in `users` but **keeps the table structure**.

* * * * *

**9️⃣ Drop Table or Database (⚠️ Irreversible)**
------------------------------------------------

### 🔹 **Drop the Users Table**

```
DROP TABLE users;

```

💡 Deletes the entire **`users`** table.

### 🔹 **Drop the Entire Database**

```
DROP DATABASE jdbc_demo;

```

💡 Deletes **`jdbc_demo`** and **all data inside it**.

* * * * *

**🖥️ How to Log In via MySQL Workbench**
=========================================

If you prefer a **graphical interface**, follow these steps:

### **1️⃣ Open MySQL Workbench**

-   Launch **MySQL Workbench** on your computer.

### **2️⃣ Create a New Connection**

-   Click **"+" (New Connection)** in the **MySQL Workbench Home Screen**.
-   Enter the following details:
    -   **Connection Name**: `JDBC Demo` (or any name)
    -   **Hostname**: `localhost`
    -   **Port**: `3306` (default)
    -   **Username**: `root`
    -   **Password**: Click **Store in Vault...** (enter your MySQL password)

### **3️⃣ Click "Test Connection"**

-   If successful, click **OK** and **Save** the connection.

### **4️⃣ Open Your Database**

-   **Double-click** the `JDBC Demo` connection.
-   Run the following SQL query to select your database:

    ```
    USE jdbc_demo;

    ```

### **5️⃣ Manage Your Database**

-   **Run queries** using the **SQL Editor**.
-   **View tables** in the **Schema Explorer** on the left.
-   **Manually insert/update/delete data** in the table view.

* * * * *
