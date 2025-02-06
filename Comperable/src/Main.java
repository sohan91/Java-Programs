import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student
{
    String name;
    int age;

    public Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Rajiv",43));
        student.add(new Student("Rajesh",39));
        student.add(new Student("Arjun",42));
        student.add(new Student("Siri",22));
        student.add(new Student("Arvind",32));
        Comparator<Student> ageComparison = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if(s1.age > s2.age)
                {
                    return 1;
                }
                return -1;
            }
        };
        student.sort(ageComparison);
        Iterator it = student.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
