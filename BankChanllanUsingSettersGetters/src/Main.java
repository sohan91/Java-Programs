public class Main
{

    public static void main(String[] args) {

  BankOperations bk = new BankOperations();
        bk.setCustomerName("Sohan ");
        bk.setAccountNumber("48754sg7r6");
        bk.setEmail("afiuhoa@aof");
        bk.setAccountBalance(1000);
        System.out.println("Transaction details of "+(bk.getCustomerName()));
        System.out.println("User Account Number is "+bk.getAccountNumber());
        System.out.println("User Mail is "+bk.getEmail());
System.out.println("Before intiating the transation balnace is "+bk.getAccountBalance());
  //System.out.println("Amount in your account is :"+bk.getAmount());

bk.withDraw(100);

bk.deposit(544);
        bk.withDraw(100.48);
//bk.setAmount(5000);
        bk.deposit(5447);




    }
}