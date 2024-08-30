package Ikinci_Ay.AppException;

public class BankAccount {
    private double balance;
    private final String accountNumber;

    public BankAccount(String accountNumber,double balance) {
        this.accountNumber= accountNumber;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345678",0);
        try {
            bankAccount.deposit(500);
        } catch (NegativeDepositException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankAccount.deposit(-100);
        } catch (NegativeDepositException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.withdraw(200);
        } catch (InsufficientFundsException | NegativeWithdrawalException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankAccount.withdraw(400);
        } catch (InsufficientFundsException | NegativeWithdrawalException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + bankAccount.getBalance());
    }

    public void deposit(double amount) throws NegativeDepositException {
        if (amount < 0) {
            throw new NegativeDepositException("Deposit amount cannot be negative");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeWithdrawalException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in the account");
        }
        if (amount < 0) {
            throw new NegativeWithdrawalException("Withdrawal amount cannot be negative");
        }
        balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
