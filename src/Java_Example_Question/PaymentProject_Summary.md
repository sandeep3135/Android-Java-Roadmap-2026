💳 Project: Payment Gateway System
Topic: Abstraction & Interfaces (The "Contract" Principle)

This project simulates a flexible payment processing system. It demonstrates how to write "Loose-Coupled" code, which is a core requirement for professional Android Development.

🚀 Key Technical Features Demonstrated:
1.Interface as a Contract:

Created the PaymentMethod interface to define a mandatory behavior (pay()).

This ensures that any new payment type (like "Crypto" or "Wallet") can be added later without changing the existing system code.

2.Multiple Implementations:

Developed UPI and CreditCard classes that fulfill the same contract in different ways.

Demonstrated Behavioral Polymorphism—where the same action (pay) produces different results based on the object.

3.Interface Referencing (The Pro-Pattern):

Used the interface type (PaymentMethod myPayment) to hold different objects.

Android Connection: This is exactly how Android handles button clicks and API responses. By using interface references, the code remains flexible and easy to maintain.