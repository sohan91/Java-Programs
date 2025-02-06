public class Challange {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.print("Eveen Number : ");
        for (int i = 1; i <= 10; i++) {
            try {
                if (i % 2 == 0) {
                    System.out.print(i+" ");
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(t1.getName() + " is Interupted ");
            }
        }
        Runnable runnable = ()-> {
            System.out.print("\nOdd Number : ");
                    for(int i = 1;i<=10;i++)
                    {
                        try
                        {
                            if(i%2!=0)
                            {
                                System.out.print(i+" ");
                            }
                            Thread.sleep(250);
                        }
                        catch (InterruptedException e)
                        {
                            System.out.println(Thread.currentThread().getName() + " is Interupted ");
                        }
                    }
                };

        t1.run();

        Thread t2 = new Thread(runnable);
        t2.start();
    }

}

