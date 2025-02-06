public class Main {
    public static void main(String[] args) {
        System.out.println("A College has :\n"+
                "\t\u0001 A faculties :\n" + "\t\t\u0003 A faculties will give the instruction to the students");

        System.out.println("""
                A College has :
                    \u0004 A faculties :
                         \u0005 A faculties will give the instruction to the students
             
                """);
        int age =20;
        System.out.printf("age is %d\n",age);
        System.out.printf("Age is %f\n",(float)age);
        System.out.printf("Age is %.2f\n",(float)age);
        System.out.printf("Age is %4.0f",(float)age);
        System.out.printf("\n");
        for(int i=1;i<=100000;i*=10)
        {
            System.out.printf("10th power by number increment is %d\n",i);
        }
        System.out.printf("\n");
        for(int i=1;i<=100000;i*=10)
        {
            System.out.printf("10th power by number increment is %6d\n",i);
        }
        System.out.printf("\n");
        for(int i=1;i<=100000;i*=10)
        {
            System.out.printf("10th power by number increment is %.0f\n",(float)i);
        }
        System.out.printf("\n");
        for(int i=1;i<=100000;i*=10)
        {
            System.out.printf("10th power by number increment is %6.0f\n",(float)i);
        }
    }
}
