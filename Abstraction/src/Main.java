import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Dog d = new Dog("Woolf","Big",100);
        d.makeNoise();
        doAnimal(d);
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(d);
        animal.add(new Dog("German,Shepard","Small",299));
        animal.add(new Fish("Gold Fish","Small",300));
        animal.add(new Fish("Tuna","Big",900));
        animal.add(new Dog("Palmarian","Big",400));
        for(Animal a : animal)
        {
            doAnimal(a);
        }

    }
    public static  void doAnimal(Animal dAnimal)
    {
        dAnimal.makeNoise();
        dAnimal.move("Slow");
    }
}
