//to overcome the incosisenc data we use synchronisation/volatile
//compare to volatile synchronisation is best opsition to overcome the misslead of data

public class ChallangeMultiThreading {
    public static void main(String[] args) throws Exception{
        BrickDiary br = new BrickDiary();
        Runnable ru1 = ()->
        {
            for(int i = 0;i<10000;i+=50)
            {
                //unloding the 50 brocks
              br.BrickIncrementCount();
            }
        };
        Runnable ru2 = ()->
        {
            for(int i = 0;i<15000;i+=50)
            {
                //unloding the 50 brocks
                br.BrickIncrementCount();
            }
        };
         Runnable ru3 = ()->
        {
            for(int i = 0;i<5000;i+=50)
            {
                //unloding the 50 brocks

                br.BrickIncrementCount();
            }
        };
         Thread tr = new Thread(ru1);
        Thread tr1 = new Thread(ru2);
        Thread tr2 = new Thread(ru3);
        tr.start();
        tr1.start();
        tr2.start();
        System.out.println("count of therad : "+Thread.activeCount());
        tr.join();
        tr1.join();
        tr2.join();

System.out.println("brick count = "+br.brickCount);
        System.out.println("brick count2 = "+br.brickCount2);

    }
}
class BrickDiary{
    int brickCount=0;
    int brickCount2=0;
    public synchronized void BrickIncrementCount()
    {
        brickCount+=50;
        brickCount2+=50;
    }
}
