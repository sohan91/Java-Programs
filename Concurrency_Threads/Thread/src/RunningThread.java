public class RunningThread {
    public static void main(String[] args) {
        System.out.println("Threas is geting satrted");
        try {
            System.out.println("Thread is in middle ");
        }
        finally {
            System.out.println("Thread would be completed ");
        }
        Thread thread =new Thread(()->
        {
          String tName = Thread.currentThread().getName();

            for(int i = 0;i<10;i++)
                try
          {
              System.out.print(". ");

              Thread.sleep(500);
          }
          catch (InterruptedException e)
          {
              System.out.println("\n Oops Thread got interruptsd ");
          }
            System.out.println("\n"+Thread.currentThread().getName()+" has been Completed ");
        });
        System.out.println(thread.getName()+" is Starting ");
        thread.start();
        System.out.println("Main Thread would be continued ");
        try
        {
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {
          e.printStackTrace();
        }
        thread.interrupt();
    }
}
