import java.util.Scanner;

public class SavingsAccount extends Account {
    protected double interestRate;

    SavingsAccount(){
        super();
        Scanner input = new Scanner(System.in);
        System.out.print("อัตราดอกเบี้ย: ");
        this.interestRate = input.nextDouble();
    }
    public void applyInterest(){
        balance += balance * interestRate / 100;
    }
}
