package T3H.Buoi6;

import java.util.Date;

public class b2 {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public b2() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public b2(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Không đủ tiền trong tài khoản.");
        } else {
            balance -= amount;
            System.out.println("Đã rút: " + amount + " USD. Số dư còn lại: " + balance + " USD.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Đã gửi: " + amount + " USD. Số dư hiện tại: " + balance + " USD.");
    }

    public void printAccountInfo() {
        System.out.println("ID tài khoản: " + id);
        System.out.println("Số dư tài khoản: " + balance + " USD");
        System.out.println("Tiền lãi hàng tháng: " + getMonthlyInterest() + " USD");
        System.out.println("Ngày tạo tài khoản: " + dateCreated);
    }

    public static void main(String[] args) {
        b2 account = new b2(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        account.printAccountInfo();
    }
}
