public class Main {
    public static void main(String[] args) {
       var thread = Thread.currentThread();
        System.out.println(thread.getClass().getName());
        Runnable runnable = ()->
        {
            for(int i = 1;i<5;i++)
            {
                System.out.print("2 ");
                try
                {
                    Thread.sleep(250);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        };
        thread.setName("from MainClass");
        thread.setPriority(thread.MAX_PRIORITY);
        System.out.println(thread);
        threadOPeration(thread);
        CustomThread customThread = new CustomThread();

        Thread runn = new Thread(runnable);

        for(int i = 1;i<5;i++)
        {
            System.out.print("0 ");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        customThread.start();
        runn.start();

    }
    public static void threadOPeration(Thread thread)
    {
        System.out.println("_".repeat(30));
        System.out.println("Thread name : "+thread.getName());
        System.out.println("Thread id : "+thread.getId());
        System.out.println("Thread priority : "+thread.getPriority());
        System.out.println("IsThread Alive : "+thread.isAlive());
        System.out.println("Thread Group : "+thread.getThreadGroup());
        System.out.println("Thread status : "+thread.getState());
        System.out.println("_".repeat(30));
    }
}
