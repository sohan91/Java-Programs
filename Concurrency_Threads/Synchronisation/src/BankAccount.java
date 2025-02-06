public class BankAccount {
    private double balance;
    public BankAccount(double balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }

    public  void deposit(double amount)
    {
        try
        {
            System.err.println("The Banke Manager Taking SomeWhere else please Wait......");
            Thread.sleep(5000);
        }catch (InterruptedException e)
        {
            System.out.println("IN-VALID...");
        }
        synchronized (this) {
            double original = balance;
            balance += amount;
            System.out.println("FOR DEPOSIT");
            System.out.print(" Balance (" + original + "), " + "Amount add(" + amount + "),  " + " FinalBalance(" + balance + ")\n");
        }
    }
public   void withDraw(double amount)
    {
        try
        {

            Thread.sleep(100);
        }catch (InterruptedException e)
        {
            System.out.println("IN-VALID...");
        }
        synchronized (this) {
            double original = balance;
            balance -= amount;
            System.out.println("FOR WITHDRAW");
            System.out.print("Balance (" + original + "), " + "Amount add(" + amount + "),  " + " FinalBalance(" + balance + ")\n");
        }
    }
}
