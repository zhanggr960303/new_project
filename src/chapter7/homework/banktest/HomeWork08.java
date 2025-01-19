package chapter7.homework.banktest;

public class HomeWork08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(15023.14);
        checkingAccount.deposit(1000);
        System.out.println("账户余额为：" + checkingAccount.getBalance());


        //测设利息类
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());
    }
}
