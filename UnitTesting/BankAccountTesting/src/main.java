public class main {

    private String name;
    private String lastName;
    private double balance;

    public main(String name, String lastName, double balance) {
        this.name = name;
        this.lastName = lastName;
        this.balance = balance;

    }

    public double Deposit(double amount, String branch)
    {
        balance +=amount;
        return balance;
    }
    public double Withdraw(double amount,String branch)
    {
        balance -= amount;
        return balance;
    }
    public double getBalance()
    {
        return balance;
    }

    public static void main(String[] args) {

        int i = 0;
        System.out.println("i = "+i++);
        System.out.println("i = "+(++i));


    }
}
