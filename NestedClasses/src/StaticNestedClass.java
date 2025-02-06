public class StaticNestedClass {
    public static void main(String[] args) {

  Student student = new Student("Sohan",99.99,"Maths");
    student.studentDetails();
   Student.MyFriend sf  = new Student.MyFriend("Vasanth",94.66,"Biology");
        Student.MyFriend.myFriend(202);
//        sf.toString();
   //System.out.println();

    }
}
