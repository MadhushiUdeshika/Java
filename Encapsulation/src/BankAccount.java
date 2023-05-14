public class BankAccount {
    private long acc_no;
    private String name, email;
    private double amount;
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
class Run {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAcc_no(123456789);
        ba.setName("Gawesh Prabhashwara");
        ba.setEmail("abc@gmail.com");
        ba.setAmount(123456.78);
        System.out.println(ba.getAcc_no() + " " + ba.getName() + " " + ba.getEmail() + "" + ba.getAmount());

    }
}