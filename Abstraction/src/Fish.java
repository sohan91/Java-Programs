public class Fish extends Animal {
    public Fish(String type, String size, int weight) {
        super(type, size, weight);
    }

   public void move(String speed)
   {
       if(speed == "Slow")
       {
           System.out.println(ExplicitType()+" is lazy fish");
       }
       else {
           System.out.println(ExplicitType()+" is a fast swimmer");
       }
   }
   public void makeNoise()
   {
       if(type == "Gold Fish")
       {
           System.out.println(type+" makes swish sounds");
       }
       else {
           System.out.println(type+" is makes squetch sounds");
       }
   }

    }
