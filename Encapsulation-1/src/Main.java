import java.lang.management.PlatformLoggingMXBean;

public class Main {
    public static  void main(String[] args)
    {
       PlayerInformation player = new PlayerInformation();
       player.name = "Sohan";
       player.health=50;
       player.weapon="Ak 47";
       int damage = 20;
        player.loseHealth(20);
        System.out.println("Remaining health is "+player.healthRemaining());
        player.health = 200;
        player.loseHealth(70);
        System.out.println("Remaining health is "+player.healthRemaining());

    }
}
