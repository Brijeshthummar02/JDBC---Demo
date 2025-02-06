# Here is a list of common MySQL commands you can use in the MySQL command-line client (CLC) terminal:

### 1\. **Connection Commands:**

-   **Connect to MySQL Server:**

    ```
    mysql -u username -p

    ```

    You will be prompted for the password.

-   **Connect to a specific database:**

    ```
    mysql -u username -p database_name

    ```

### 2\. **Database Operations:**

-   **Show all databases:**

    ```
    SHOW DATABASES;

    ```

-   **Create a new database:**

    ```
    CREATE DATABASE database_name;

    ```

-   **Select a database to use:**

    ```
    USE database_name;

    ```

-   **Delete a database:**

    ```
    DROP DATABASE database_name;

    ```

### 3\. **Table Operations:**

-   **Show all tables in the current database:**

    ```
    SHOW TABLES;

    ```

-   **Create a new table:**

    ```
    CREATE TABLE table_name (
        column1 datatype,
        column2 datatype,
        ...
    );

    ```

-   **Describe the structure of a table:**

    ```
    DESCRIBE table_name;

    ```

-   **Delete a table:**

    ```
    DROP TABLE table_name;

    ```

### 4\. **Data Manipulation Commands:**

-   **Insert data into a table:**

    ```
    INSERT INTO table_name (column1, column2, ...)
    VALUES (value1, value2, ...);

    ```

-   **Select data from a table:**

    ```
    SELECT * FROM table_name;

    ```

-   **Update existing data in a table:**

    ```
    UPDATE table_name
    SET column1 = value1, column2 = value2, ...
    WHERE condition;

    ```

-   **Delete data from a table:**

    ```
    DELETE FROM table_name
    WHERE condition;

    ```

### 5\. **Query Filtering and Sorting:**

-   **Select data with conditions:**

    ```
    SELECT * FROM table_name WHERE condition;

    ```

-   **Order results:**

    ```
    SELECT * FROM table_name ORDER BY column_name ASC|DESC;

    ```

-   **Limit the number of rows:**

    ```
    SELECT * FROM table_name LIMIT number_of_rows;

    ```

### 6\. **User and Privileges Management:**

-   **Create a new user:**

    ```
    CREATE USER 'username'@'host' IDENTIFIED BY 'password';

    ```

-   **Grant privileges to a user:**

    ```
    GRANT ALL PRIVILEGES ON database_name.* TO 'username'@'host';

    ```

-   **Show user privileges:**

    ```
    SHOW GRANTS FOR 'username'@'host';

    ```

-   **Revoke privileges from a user:**

    ```
    REVOKE ALL PRIVILEGES ON database_name.* FROM 'username'@'host';

    ```

-   **Delete a user:**

    ```
    DROP USER 'username'@'host';

    ```

### 7\. **Indexing and Keys:**

-   **Create an index:**

    ```
    CREATE INDEX index_name ON table_name (column_name);

    ```

-   **Show indexes of a table:**

    ```
    SHOW INDEXES FROM table_name;

    ```

-   **Drop an index:**

    ```
    DROP INDEX index_name ON table_name;

    ```

### 8\. **Backup and Restore:**

-   **Backup database (using MySQL dump):**

    ```
    mysqldump -u username -p database_name > backup_file.sql

    ```

-   **Restore database (using MySQL dump file):**

    ```
    mysql -u username -p database_name < backup_file.sql

    ```

### 9\. **Other Useful Commands:**

-   **Show current MySQL version:**

    ```
    SELECT VERSION();

    ```

-   **Show current status:**

    ```
    SHOW STATUS;

    ```

-   **Exit MySQL:**

    ```
    EXIT;

    ```

-   **Show running processes:**

    ```
    SHOW PROCESSLIST;

    ```

-   **Flush privileges (to reload changes):**

    ```
    FLUSH PRIVILEGES;

    ```
