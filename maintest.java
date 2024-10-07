public class maintest {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();
        savings.applyInterest();
        System.out.println("อัปเดตยอด: " + savings.getBalance());

        CheckingAccount checking = new CheckingAccount();
        checking.withdraw();
        System.out.println("ยอดคงเหลือ: " + checking.getBalance());
    }
}
