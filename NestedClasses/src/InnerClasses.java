import java.util.ArrayList;
import java.util.List;
record Nemployee(String name,int id, int experience)
{

}
record Nemployee1(String name,int id, int experience,double salary)
{

}

public class InnerClasses {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101,"Sohan",2));
        emp.add(new Employee(102,"Vasanth",3));
        emp.add(new Employee(103,"Arjun",4));

        System.out.println(emp);

        Employee emp1 = new Employee(104,"Varun",202);
        Employee.Developers dec = emp1.new Developers(202,"Abhi",3,20000);
        System.out.println(dec);
        //        emp.form;
    }

}
