import java.util.Scanner;

public class Account{
    protected double balance;
    protected Scanner input = new Scanner(System.in);

    Account() {
        System.out.print("ยอดเงินของคุณ: ");
        this.balance = input.nextDouble();
    }
    public void deposit() {
        System.out.println("กรอกจำนวนเงินฝาก: ");
        double amount = input.nextDouble();
        balance += amount;
    }
    public void withdraw() {
        System.out.println("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
