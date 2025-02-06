public abstract  class Animal {
    protected String type;
    private  String size;
    private int  weight;
    public Animal(String type,String size,int weight)
    {
        this.weight =weight;
        this.size =size;
        this.type=type;
    }
    public abstract void move(String speed);
    public abstract void makeNoise();
   public  String ExplicitType()
   {
       return getClass().getName()+ "(" + type + ")";
   }
}
