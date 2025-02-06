public class Student {
    public static String name;
    public  static double marks;
    private static String subject;

    public Student(String name,double marks,String subject)
    {
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }
    public void studentDetails()
    {
        System.out.println(name+" got "+marks+" in "+subject+" Subject");
    }
    public static class MyFriend
    {
        public MyFriend(String name,double marks,String subject)
        {
            super();
        }
        public static void myFriend(double marks)
        {
            System.out.println(" My friend got "+marks);
        }
        public String toString()
        {
            return getClass().getName()+ " "+name+" got "+marks+" in "+subject;
        }
    }


}
