public class CreationOfThread {
    public static void main(String[] args) {
        //1st  thread
//    {
//        Thread t1 = new Thread();
//
//        t1.start();//2nd thread creates and destroy
//        //t1.run();
//        Thread t2 = new Thread();//creates
//        t2.start();//after completion of opertion thred get distroy
//        Thread t3 = new Thread();//cration
//        t3.start();//after completion of opertion thred get distroy
//        Thread t4 = new Thread();//creation
//        t4.start();//after completion of opertion thred get distroy
        Studetns st = new Studetns();
        st.run();
        Employee emp = new Employee();
        emp.run();
        System.out.println("coumt is " + Thread.activeCount());
    }

    }
    class Studetns extends Thread{
     public void run()
     {
         System.out.println("Studetns is running");
     }
    }

class Employee extends Thread{
    public void run()
    {
        System.out.println("Employee is running");
    }
}
