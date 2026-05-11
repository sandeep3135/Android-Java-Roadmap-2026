🏦 Project: Mini-Banking Console System
Developer: Sandeep

Tech Stack: Java (OOP Fundamentals)

🚀 Key Technical Features Demonstrated:
1.Inheritance (extends & super):

Created a Parent class (BankManager) for general banking and a specialized Child class (SavingsAccount).

Used super() to reuse Parent constructor logic, saving time and memory.

2.Encapsulation & Access Modifiers:

Used protected variables so Child classes can access the balance while keeping it hidden from the "outside world."

Implemented Getter methods (getBalance) for secure data reading.

3.Polymorphism & Type Casting:

Managed a diverse group of accounts (Regular and Savings) within a single array (BankManager[]).

Used instanceof to safely identify specific account types during processing.

Applied Type Casting to unlock specialized features like addInterest() only for eligible accounts.

4.Transaction Logic:

Built validation logic for Deposits and Withdrawals to prevent negative transactions or overdrafts.

Automated batch processing using loops and parallel data arrays for transaction amounts.

-->File Structure:
BankManager.java: The Parent class containing core logic for names, balances, and basic transactions.

SavingsAccount.java: The Child class adding interest-bearing capabilities and specialized reporting.
