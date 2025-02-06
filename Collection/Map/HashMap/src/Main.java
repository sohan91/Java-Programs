import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();
        Map<Integer,String> employee = new HashMap<>();
        System.out.println("-".repeat(50));
        System.out.println("Student Details".toUpperCase());
        System.out.println("-".repeat(50));
        student.put(2,"Mani");
        student.put(3,"Latha");
        student.put(4,"Srinu");
        student.put(10,"Sohan");
        System.out.println(student);
        System.out.println("Is contains Sohan in Map : "+student.containsValue("Sohan"));
        System.out.println("Does the key 2 exists : "+student.containsKey(2));

        System.out.println("-".repeat(50));

        System.out.println("Employee details".toUpperCase());
        System.out.println("-".repeat(50));

        employee.put(101,"Sohan");
        employee.put(107,"Mani");
        employee.put(102,"Latha");
        employee.put(104,"Srinu");
        System.out.println(employee);
        System.out.println("is First object is equal to the Second Objects : "+employee.equals(student));
        System.out.println("Mani contains in employee : "+employee.containsValue("Mani"));
        System.out.println("is 100key exists in Map : "+employee.containsKey(103));

    }
}
