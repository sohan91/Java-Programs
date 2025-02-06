abstract  class Anonymus
{
   abstract public void display();
}
public class AnonymousClass {

    public static void main(String[] args) {

        Anonymus an = new Anonymus() {
           public  void display()
           {

System.out.println("I am anonymus class");           }
        };
        an.display();
    }
}
