public class BankAccount {

    private String accountNumber;
    private String name;
    private String email;
    private String PhoneNumber;
    private double balance;

    public BankAccount() {
        System.out.println("empty spaces");


    }

    public BankAccount(String accountNumber, double balance, String name, String phoneNumber, String email) {
        System.out.println("with call parametrs");
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.PhoneNumber = phoneNumber;
    }

    public void deposid(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("deposit of " + depositAmount + "new balance is " + this.balance);

    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("only " + this.balance + "avaliable withdrawamounth");
        } else {
            balance -= withdrawalAmount;
            System.out.println("withdrawal of " + withdrawalAmount + "processed" + this.balance);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
