public class LocalClassOperation {
    private String name;
    private int rank;
    public  void operation(String name,int rank)
    {
        class Another
        {
            int number;
            public void number(int number)
            {
                System.out.println("Number is "+number);
            }
        }
        Another an = new Another();
        an.number(99332827);
        System.out.println(name+" got "+rank);
    }
}
