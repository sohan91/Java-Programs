public class MainForAnimalAndDog {
    public static void main(String[] args) {
        Animal obj= new  Animal("Lion","hunting","Faster",800);
        animalStuff(obj,"faster");

        obj.toString();

//      Dog dog= new Dog();
//        animalStuff(dog,"Faster");

      Dog dog1 = new Dog("German Shepard","Dog",405);

         animalStuff(dog1,"Faster");
        dog1.toString();

      Dog dog2 = new Dog("Pit BUll","Dog","Slower",45210,"Sharp","Straight");
         animalStuff(dog2,"slower");
        dog2.toString();

        Fish fis = new Fish("Crab","acquatic animal","faster",424,68,547);
        animalStuff(fis,"faster");
    }
    public static void animalStuff(Animal obj,String speed)
    {
        obj.aboutSpeed(speed);
        obj.aboutType();
        obj.aboutWeight();
        System.out.println(obj);
        System.out.println("------------");
    }
}
