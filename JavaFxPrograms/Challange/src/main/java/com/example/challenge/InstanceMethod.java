//instance method

class sample{
void fun(){
System.out.println("Im an instance method");
}
}
public class Mainclass
{
 public static void main(String args[]){
 Sample s = new sample();
 s.fun();
 Mainclass m = new Mainclass();
 m.fun2();
}
void fun2(){
    System.out.println("Im in fun 2 modgud");
}
}