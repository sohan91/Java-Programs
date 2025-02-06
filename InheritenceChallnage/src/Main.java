public class Main {
    public static void main(String[] args) {
        Worker wk = new Worker("Mani","12/11/2004");
        System.out.println(wk);
        System.out.println("Age is "+wk.getAge());
        System.out.println("Collect Pay is "+wk.collectPay());
  Employee emp = new Employee("Sohan","20/05/2003","20/10/2024");
System.out.println(emp);
System.out.println("Age = "+emp.getAge());
System.out.println("collect Pay is "+emp.collectPay());

        Employee emp1 = new Employee("Ajun","28/05/2004","20/10/2024");
        System.out.println(emp1);
        System.out.println("Age = "+emp1.getAge());
        System.out.println("collect Pay is "+emp1.collectPay());

        SalariedEmployee sl = new SalariedEmployee("Sohan","20/05/2004","20/10/2023",80000,true);

        System.out.println(sl);
       System.out.println("collect pay is "+sl.collectPay());

       HourlyEmployee he = new HourlyEmployee("Venkatesh","20/05/2000","20/05/2025",125.56);
       he.hourlypayRate(9);
       System.out.println(he.toString());
    }
}
