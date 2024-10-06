import java.util.Scanner;

public class CheckingAccount extends Account{
    protected double overdraftLimit;

    CheckingAccount() {
        super();
        Scanner input = new Scanner(System.in);
        System.out.print("ยอดขีดจำกัดการถอนเงิน: ");
        this.overdraftLimit = input.nextDouble();
    }
    public void withdraw() {
        System.out.print("กรอกจำนวนเงินที่ถอน: ");
        double amount = input.nextDouble();
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("เกินขึดจำกัดการถอน.");
        }
    }
}
