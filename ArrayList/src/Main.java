import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static  void main(String[] args) {
 getList[] grocery = new getList[3];//Array
grocery[0] = new getList("Mango");
grocery[1] = new getList("Grapes","Fruit",2);
grocery[2]  = new getList("Apples");
System.out.println("list is "+Arrays.toString(grocery));
ArrayList ob = new ArrayList();
ob.add(new getList("Promogranates"));
ob.add("Mango");
System.out.println("list is "+ob);
ArrayList<getList> object = new ArrayList();
object.add(new getList("PineApples"));
object.add(new getList("Coonut","Fruit",1));
object.set(0,new getList("Apple"));
object.remove(1);
System.out.println("Array List is "+object);

    }
    record getList(String name,String type,int noOfitems)
    {
        public getList(String name)
        {

            this(name,"Fruit",1);
        }

        @Override
        public String toString() {
            return this.name+" is type of "+this.type+" ,We have "+noOfitems+" bunch of "+this.name ;
        }
    }

}
