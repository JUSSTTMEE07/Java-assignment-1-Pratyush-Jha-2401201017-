🏦 Java Assignment 1 — Banking Application

📘 Course Details

**Course Name:** Java Programming
**Course Code:** ENCS201 / ENCA203 / ENBC205
**Department:** School of Engineering & Technology (SOET)
**Faculty:** Dr. Manish Kumar
**Student Name:** Pratyush Jha
**Roll No.:** 2401201017
**Session:** 2025–26 (3rd Semester)

---

### 🧩 Project Title

**Banking Application for Account Management**

---

### 🧠 Problem Statement

Design and implement a simple **banking application** that allows users to manage their bank accounts. The system should enable operations such as:

* Creating new accounts
* Depositing money
* Withdrawing money
* Viewing account details
* Updating contact information

The project demonstrates the use of **Java’s object-oriented programming**, **control structures**, **arrays**, and **string manipulation** concepts.

---

### 🎯 Learning Outcomes

* Understand and apply basic Java concepts: data types, operators, loops, and conditionals.
* Implement user interaction and input handling using the `Scanner` class.
* Manage multiple accounts using arrays.
* Manipulate and validate strings such as names, emails, and phone numbers.
* Gain hands-on experience with GitHub for version control and code submission.

---

### 🏗️ Implementation Overview

#### 1. **Account Class**

Handles individual account details and operations.

**Attributes:**

* `accountNumber` (int) – Unique account ID
* `accountHolderName` (String) – Name of the holder
* `balance` (double) – Current account balance
* `email` (String) – Email ID
* `phoneNumber` (String) – Contact number

**Methods:**

* `deposit(double amount)` – Add money to the account (positive amount validation).
* `withdraw(double amount)` – Withdraw money (checks sufficient balance).
* `displayAccountDetails()` – Print account details.
* `updateContactDetails(String email, String phoneNumber)` – Update user info.

---

#### 2. **UserInterface Class**

Manages multiple accounts and handles user inputs.

**Features:**

* Create new accounts
* Deposit / Withdraw funds
* Show account details
* Update contact details
* Menu-driven interface using control structures (`switch`, loops)

---

### 🧮 Sample Interaction

```
Welcome to the Banking Application!
1. Create a new account
2. Deposit money
3. Withdraw money
4. View account details
5. Update contact details
6. Exit
Enter your choice: 1
Enter account holder name: John Doe
Enter initial deposit amount: 1000.0
Enter email address: john.doe@example.com
Enter phone number: 1234567890
Account created successfully with Account Number: 1001
```

---

### 🧰 Technologies Used

* **Language:** Java (JDK 17+ recommended)
* **IDE:** IntelliJ IDEA / Eclipse / VS Code
* **Version Control:** Git & GitHub

---

### ✅ Evaluation Rubric Highlights

* Proper implementation of object-oriented concepts
* Efficient use of control structures and arrays
* Input validation and exception handling
* String manipulation and formatting
* Clear code structure and comments

---

### 🧑‍💻 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/JUSSTTMEE07/Java-assignment-1-Pratyush-Jha-2401201017-.git
   ```
2. Open the project in your IDE.
3. Compile and run the `Main.java` or `UserInterface.java` file.
4. Follow the console instructions.

---

### 📚 Acknowledgment

This project was developed as part of the **Java Programming** course at **K.R. Mangalam University**, under the guidance of **Dr. Manish Kumar**.

