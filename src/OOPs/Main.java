package OOPs;

// Main class
public class Main {

    public static void main(String[] args) {

        // =====================================================
        // 1. OBJECT
        // =====================================================

        SavingsAccount account = new SavingsAccount(
                "Denish",
                101,
                5000
        );

        // Calling methods
        account.showAccountDetails();

        account.deposit(2000);
        account.deposit(1000, "UPI");   // Method Overloading

        account.withdraw(1000);

        System.out.println("Balance: " + account.getBalance());


        // =====================================================
        // 2. ENCAPSULATION
        // =====================================================

        /*
           balance is private.

           We cannot directly do:

           account.balance = 100000;

           Instead, we use:
           getBalance()
           deposit()
           withdraw()
        */

        System.out.println("Account Holder: " + account.getName());


        // =====================================================
        // 3. INHERITANCE
        // =====================================================

        /*
           SavingsAccount extends BankAccount.

           Therefore SavingsAccount gets
           properties and methods of BankAccount.
        */


        // =====================================================
        // 4. POLYMORPHISM
        // =====================================================

        // Parent reference = Child object
        BankAccount account2 = new SavingsAccount(
                "Rahul",
                102,
                10000
        );

        account2.showAccountType();

        /*
           Although account2 is BankAccount reference,
           the SavingsAccount version of
           showAccountType() will execute.

           This is METHOD OVERRIDING.
        */


        // =====================================================
        // 5. ABSTRACTION
        // =====================================================

        /*
           BankAccount is an abstract class.

           We cannot create:

           BankAccount b = new BankAccount();

           Instead, we create its child object.
        */


        // =====================================================
        // 6. INTERFACE
        // =====================================================

        Payment payment = new UpiPayment();

        payment.pay(500);


        // =====================================================
        // 7. instanceof
        // =====================================================

        if (account instanceof SavingsAccount) {
            System.out.println("This is a Savings Account");
        }


        // =====================================================
        // 8. STATIC
        // =====================================================

        System.out.println("Total Accounts: "
                + BankAccount.totalAccounts);


        // =====================================================
        // 9. FINAL
        // =====================================================

        System.out.println("Bank Name: "
                + BankAccount.BANK_NAME);
    }
}


// =============================================================
// ABSTRACT CLASS
// =============================================================

abstract class BankAccount {

    // =========================================================
    // ENCAPSULATION
    // =========================================================

    private String name;
    private int accountNumber;
    private double balance;


    // =========================================================
    // STATIC
    // =========================================================

    static int totalAccounts = 0;


    // =========================================================
    // FINAL
    // =========================================================

    final static String BANK_NAME = "ABC Bank";


    // =========================================================
    // CONSTRUCTOR
    // =========================================================

    BankAccount(String name, int accountNumber, double balance) {

        // "this" refers to current object

        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }


    // =========================================================
    // GETTERS
    // =========================================================

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    // =========================================================
    // DEPOSIT
    // =========================================================

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println(
                    "Deposited: " + amount
            );
        }
    }


    // =========================================================
    // WITHDRAW
    // =========================================================

    public void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println(
                    "Withdrawn: " + amount
            );

        } else {

            System.out.println(
                    "Insufficient Balance"
            );
        }
    }


    // =========================================================
    // ABSTRACT METHOD
    // =========================================================

    abstract void showAccountType();


    // =========================================================
    // NORMAL METHOD
    // =========================================================

    public void showAccountDetails() {

        System.out.println(
                "Name: " + name
        );

        System.out.println(
                "Account Number: " + accountNumber
        );

        System.out.println(
                "Balance: " + balance
        );
    }
}


// =============================================================
// INHERITANCE
// =============================================================

class SavingsAccount extends BankAccount {


    // =========================================================
    // CONSTRUCTOR
    // =========================================================

    SavingsAccount(
            String name,
            int accountNumber,
            double balance
    ) {

        // super() calls parent constructor

        super(name, accountNumber, balance);
    }


    // =========================================================
    // METHOD OVERRIDING
    // =========================================================

    @Override
    void showAccountType() {

        System.out.println(
                "Account Type: Savings Account"
        );
    }


    // =========================================================
    // METHOD OVERLOADING
    // =========================================================

    public void deposit(double amount, String method) {

        System.out.println(
                "Payment Method: " + method
        );

        deposit(amount);
    }
}


// =============================================================
// INTERFACE
// =============================================================

interface Payment {

    // Abstract method

    void pay(double amount);
}


// =============================================================
// INTERFACE IMPLEMENTATION
// =============================================================

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid ₹" + amount + " using UPI"
        );
    }
}