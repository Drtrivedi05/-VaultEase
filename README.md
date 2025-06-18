💼 VaultEase – Java GUI Banking System

**VaultEase** is a simple, secure, and user-friendly banking system built using **Core Java** and **Swing GUI**. It allows users to create bank accounts, deposit and withdraw money, and check balances — all within a lightweight desktop interface.

---

## 🧰 Features

- Create new accounts with an initial deposit
- Deposit money to existing accounts
- Withdraw money securely (with balance check)
- Check account details and current balance
- Data stored securely using Java's `Serializable` object storage
- Intuitive GUI built with `JFrame`, `JButton`, `JTextField`, and `JOptionPane`

---

## 🛠️ Technologies Used

- Java SE (JDK 8+)
- Java Swing (GUI)
- Object-Oriented Programming (OOP)
- File Handling with Serialization (`accounts.dat`)

---

## 📦 Folder Structure

```
VaultEase/
├── MainMenu.java         # Main menu UI
├── CreateAccount.java    # Account creation form
├── Deposit.java          # Deposit form
├── Withdraw.java         # Withdraw form
├── CheckBalance.java     # Balance inquiry window
├── Account.java          # Data model for Account
└── BankData.java         # File handling and logic layer
```

---

## 🚀 How to Run

### 1. ✅ Requirements

- Java JDK 8 or above installed  
- Any text editor or Java IDE (NetBeans, IntelliJ IDEA, Eclipse)

---

### 2. 💻 Compilation & Execution

#### A. Compile All Files

```bash
javac *.java
```

#### B. Run the Application

```bash
java MainMenu
```

> 💡 A GUI window titled **"Banking System"** will appear. From here, you can access all the features.

---


## 📂 Data Storage

- All accounts are stored in a file called `accounts.dat` in serialized format.
- Uses a `HashMap<Integer, Account>` to store and manage account data in memory.

---

## 👨‍💻 Developer Notes

- The application uses `JOptionPane` for user notifications and messages.
- You can extend this to include account deletion, transaction history, or even database support.

---

## 📄 License

This project is open-source and available under the MIT License. Feel free to use and modify it.

---

## 🙌 Author

**Dhrumil Trivedi**  
Java Developer | Cybersecurity Enthusiast  
LinkedIn/GitHub: *Add your links here*
