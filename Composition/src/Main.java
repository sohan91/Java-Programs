import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public class Main {


        public static void main(String[] args) {

            SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

            kitchen.setKitchenState(true, false, true);
            kitchen.doKitchenWork();
            System.out.println("\n");
            kitchen.setKitchenState(false, false, true);
            kitchen.doKitchenWork();
        }
    }


