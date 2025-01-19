package chapter7.homework.banktest;

public class SavingsAccount extends BankAccount{

    private int count = 3;
    private double rate = 0.01;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }


    public void earnMonthlyInterest(){
        this.setCount(3);
        super.deposit(getBalance() * rate);
    }

    public void deposit(double amount) {
        if(count > 0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1);
        }
    }

    public void withdraw(double amount) {
        if(count > 0) {
            super.withdraw(amount);
            count--;
        } else {
            super.withdraw(amount + 1);
        }
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
