public class PlayerInformation {
    public String name;
    public int health;
    public String weapon;
    public void loseHealth(int damage)
    {
        health = health-damage;
        if(health<=0)
        {
            System.out.println(name+" was kmock down by"+weapon+" weapon");
        }
    }
    public  void  restoreHealth(int extraHealth)
    {
        health = health+extraHealth;
        if(health>100)
        {
            System.out.println(name+" was restored 100% HP by extra tokens");
            health = 100;
        }
    }
    public int healthRemaining()
    {
        return health;
    }
}
