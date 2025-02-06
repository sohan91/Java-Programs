public class Dog extends Animal {
    public Dog(String type, String size, int weight)
    {
        super(type, size, weight);
    }

   public void move(String speed)
   {
       if(speed == "Slow")
       {
           System.out.println(ExplicitType()+" dog is Walking..!");
       }
       else {
           System.out.println(ExplicitType()+" dog is Running..!");
       }
   }
   public void makeNoise()
   {
       if(type == "Woolf")
       {
           System.out.println(type+" makes Howling..! sounds");
       }
       else {
           System.out.println(type+" makes Woof..! sounds");
       }
   }

    }
