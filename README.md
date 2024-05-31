# CODE_ALPHA_TASK2

This Java program simulates a simple banking system where users can create an account, deposit money, withdraw money, and view account details.

balance: A static double variable to keep track of the account balance.

name: A static string to store the account holder's name.

accountNumber: A static integer to store the account number.

Initializes a Scanner object for user input.
Continuously displays a menu with five options:

Create Account: Prompts the user to enter their name, account number, and an initial deposit amount. This information is stored in the corresponding static variables.

Deposit: Asks the user for an amount to deposit and adds it to the balance.

Withdraw: Prompts the user for an amount to withdraw and checks if the balance is sufficient before deducting the amount from the balance.

Display Account Details: Prints the account holder's name, account number, and current balance.

Exit: Ends the program with a thank-you message.

Helper Methods:

createAccount(): Handles the account creation process.

deposit(): Manages depositing money into the account.

withdraw(): Handles money withdrawal, checking for sufficient funds.

displayAccountDetails(): Displays the stored account details
