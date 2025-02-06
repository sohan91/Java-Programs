public class FullyEncapsulatedPayerInfo {
    private String playerName;
    private  int health;
    private  String weapon;

    public FullyEncapsulatedPayerInfo(String name)
    {
        this(name,200,"Scarale");
    }
    public FullyEncapsulatedPayerInfo(String playerName,int health,String weapon)
    {
        this.playerName = playerName;
        if(health<=0)
        {
            this.health = 1;
        } else if (health>100) {
           this.health=100;
        }
        else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public  void loseHealth(int damage)
    {
        health = health-damage;
        if(health<0)
        {
            System.out.println(playerName+"was knock Down by "+weapon+" weapon");
        }
        else {
            System.out.println(playerName+ " was damaged by "+damage+" Hp by "+weapon+" weapon");
        }
    }
    public void restoreHealth(int extraHealth)
    {
        health+=extraHealth;
        if(health>100)
        {
            System.out.println(playerName+ " is fully restored health with 100% HP");
            health = 100;
        }
    }
    public int getHealth()
    {
        return health;
    }
}
