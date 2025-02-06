public class MultipleThread2 {
    public static void main(String[] args) {

        Student s = new Student();
        s.start();
        Employees empl = new Employees();
        empl.start();
        System.out.println("coumt is " + Thread.activeCount());
    }

}
class Student extends Thread{
    public void run()
    {
        System.out.println("Studetns is running ,thread name is " + Thread.currentThread().getName()+" and id is "+Thread.currentThread().getId());
    }
}

class Employees extends Thread{
    public void run()
    {

        System.out.println("Employee is running ,thread name is " + Thread.currentThread().getName()+" and id is "+Thread.currentThread().getId());  }
}

