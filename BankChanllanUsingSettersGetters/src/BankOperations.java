class BankOperations
{
    private double amount;
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private  String email;
   public void deposit(double amount)
    {
        accountBalance+=(double)amount;
        System.out.println(" You have deposited amount is $"+amount+"..After deposit account balance is $"+accountBalance);
    }
    public void withDraw(double amount)
    {
        if((accountBalance-amount)<0)
        {
            System.out.println("Sorry! You have insufficient amoubt in your balnk");
        }
        accountBalance-=amount;
        System.out.println("Afer withdrawing the amount of "+amount+" Bank balance is "+accountBalance);

    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}