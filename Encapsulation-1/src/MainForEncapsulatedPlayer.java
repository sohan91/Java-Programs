public class MainForEncapsulatedPlayer {
    public static void main(String[] args) {
      FullyEncapsulatedPayerInfo player = new FullyEncapsulatedPayerInfo("Sohan");
      System.out.println("initial health is "+player.getHealth());
      FullyEncapsulatedPayerInfo player1 = new FullyEncapsulatedPayerInfo("Sohan",80,"Scaral");
      int damage = 80;
       System.out.println("damge is "+damage);
      //System.out.println("reamaining health after the damage is "+ player1.getHealth());
       //player1.restoreHealth(damage);
      player1.loseHealth(damage);
      System.out.println("Currently, player Hp is "+player1.getHealth());
      int restore = 180;
      player1.restoreHealth(restore);
        System.out.println("Currently, player Hp is "+player1.getHealth());
    }
}
