# Employee & Department Management System (JDBC Project)

## 📌 Project Overviee

This is a Java-based console application that manages Employees and Departments using JDBC.  
The project follows the DAO (Data Access Object) design pattern to perform database operations efficiently.

---

## 🚀 Features

### 👨‍💼 Employee Module

* Add Employee
* Find Employee by ID
* View All Employees
* Update Employee Details
* Delete Employee
* Login using Email & Password

### 🏢 Department Module

* Add Department
* View Department Details
* (Extendable for Update/Delete)

---

## 🛠️ Technologies Used

* Java
* JDBC (Java Database Connectivity)
* MySQL
* Eclipse IDE

---

## 📂 Project Structure
* com.empapp.dao → DAO Interfaces
* com.empapp.dao.impl → DAO Implementations
* com.empapp.dto → DTO Classes (Employee, Dept)
* com.empapp.utility → Database Connection (Connector)
* empapp.test → Main/Test Class


---

## 🗄️ Database Schema

### Employee Table

CREATE TABLE EMPLOYEE (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(50),
    JOB VARCHAR(50),
    SAL DOUBLE,
    DNO INT,
    CREATED_AT TIMESTAMP,
    MAIL VARCHAR(100),
    PASSWORD VARCHAR(100)
);

### Department Table
CREATE TABLE DEPT (
    DNO INT PRIMARY KEY,
    DNAME VARCHAR(50),
    LOCATION VARCHAR(50)
);

----

## 🔗 Relationship

* EMPLOYEE.DNO is a Foreign Key referencing DEPT.DNO

---

## ▶️ How to Run the Project

1. Clone the repository  
2. Open project in Eclipse  
3. Configure database credentials in `Connector.java`  
4. Create tables in MySQL using above SQL  
5. Run `Test.java`  
6. Perform operations via console  
