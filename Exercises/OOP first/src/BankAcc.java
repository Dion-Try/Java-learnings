public class BankAcc {
    private int accountNumber;
    private double balance;
    private String costumerName;
    private String email;
    private String phoneNumber;


    public BankAcc() {
        System.out.println("Constructor is called");
        this(5678, 10, "Default name", "Default email", "Default phone number");
    }

    public BankAcc(int accountNumber, double balance,String costumerName, String email, String phoneNumber) {
        System.out.println("Constructor is called with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.costumerName = costumerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAcc(String costumerName, String email, String phoneNumber) {
        this(9999, 100.50, costumerName, email, phoneNumber);
//        this.costumerName = costumerName;
  //      this.email = email;
    //    this.phoneNumber = phoneNumber;
    }

    public void deposit(double sum){
        balance += sum;
        System.out.println("Deposited " + sum);
        System.out.println("Balance is " + balance);
    }

    public void withdraw(double sum){
        double fictional = balance - sum;
        if(balance - sum >= 0) {
            balance -= sum;
            System.out.println("Withdrawn " + sum);
            System.out.println("Balance is " + balance);
        }
        else{
            System.out.println("Withdrawal of "+sum+" not possible");
            System.out.println("Insufficient balance, if we were to withdraw you would have this amount in your account: "+fictional);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
