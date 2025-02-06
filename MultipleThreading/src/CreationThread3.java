public class CreationThread3 {
    public static void main(String[] args) {

        Students s = new Students();
        Thread td = new Thread(s,"T0");
        td.start();
        isEmployees empl = new isEmployees();
        Thread td2 = new Thread(empl,"T1");
        td2.start();
        System.out.println("coumt is " + Thread.activeCount());
    }

}
class Students extends Thread {
    public void run()
    {
        System.out.println("Studetns are running ,thread name is " + Thread.currentThread().getName()+" and id is "+Thread.currentThread().getId());
    }
}

class isEmployees implements Runnable {
    public void run()
    {
        System.out.println("Employee are  running ,thread name is " + Thread.currentThread().getName()+" and id is "+Thread.currentThread().getId());
    }
}

