# Secure-Java-Finance-Tracker
"A console-based Personal Finance Tracker built using Java, JDBC, and OOP principles."
# Secure Personal Finance Tracker (CSE2006)

## Overview
A robust, console-based personal finance management application developed using Java. It demonstrates advanced concepts like OOP, JDBC for database interaction, Collections for data analysis, and layered architecture design.

## Features
* 🔐 **Secure User Authentication:** Login and registration using database persistence.
* 💰 **Transaction Management:** Full CRUD support for Income and Expense records.
* 📈 **Reporting:** Generates category-wise spending reports using Java Collections.
* 📤 **Data Export:** Exports transaction history to a CSV file (Java I/O Streams).
* ✅ **Robustness:** Implements comprehensive Exception Handling for database and I/O operations.

## Technologies / Tools Used
| Component | Technology | Note |
| :--- | :--- | :--- |
| **Language** | Java 17+ | Core implementation. |
| **Database** | [Your Chosen DB, e.g., MySQL / SQLite] | Used for persistent data storage. |
| **Driver** | JDBC Connector | Required for database connection. |
| **Version Control**| Git / GitHub | For version tracking and collaboration. |

## ⚙️ Steps to Install & Run the Project

1.  **Clone the Repository:**
    ```bash
    git clone [Your Repository URL]
    cd Secure-Java-Finance-Tracker-CSE2006
    ```
2.  **Database Setup:**
    * Install [Your Chosen DB] locally.
    * Run the schema setup SQL (found in `data/schema.sql`) to create the `USER` and `TRANSACTION` tables.
3.  **Dependency Setup:**
    * Download the **JDBC driver JAR** for your database and place it inside the `lib/` folder.
4.  **Compilation & Execution:**
    * Compile all Java files, ensuring the JDBC driver is included in the classpath:
        ```bash
        # Example for Linux/macOS
        javac -cp ".:lib/*" src/main/java/com/financeapp/ui/MainApp.java 
        # Example to run the main class
        java -cp ".:lib/*" com.financeapp.ui.MainApp
        ```

## Instructions for Testing
* **Test Case 1 (Registration/Login):** Verify a new user can register and log in successfully.
* **Test Case 2 (CRUD):** Add an Income and an Expense transaction, then view the list and attempt to delete/edit one.
* **Test Case 3 (Error Handling):** Try entering text when prompted for an amount (expect a graceful error message).
* **Test Case 4 (Reporting):** Generate a summary report to verify calculations are correct.
