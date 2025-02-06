public class Main{

    public static void main(String[] args)
    {
        Sum m = new Sum()
        {
                public int sum(int a,int b)
                {
                    return a+b;
                }
                public int Sub(int a ,int b)
                {
                    return a-b;
                }
                public  int Mul(int a,int b)
                {
                    return a*b;
                }
        };
        System.out.println("Sum = "+m.sum(3,4));
        System.out.println("Sub = "+m.Sub(90,33));
        System.out.println("Mul = "+m.Mul(7,9));
    }
}
