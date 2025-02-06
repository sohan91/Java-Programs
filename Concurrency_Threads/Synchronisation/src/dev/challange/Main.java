package dev.challange;
import java.util.Random;

record Orders(long id, String type, int quantity)
{

};
public class Main {
    static final Random rdId = new Random();
    public static void main(String[] args) {

          ShoeProducts product = new ShoeProducts();
              Thread t1 = new Thread(() ->
              {
                  for (int i = 0; i <10; i++) {
                    product.reciverOrder( new Orders(rdId.nextLong(1000000, 9999999), product.produtTyep[rdId.nextInt(0, 4)], rdId.nextInt(1, 4)));
                  }
              });
        t1.start();
        for(int i = 0;i<2;i++)
        {
            Thread t2 = new Thread(()->
            {
               for(int j =1;j<5;j++)
               {
                   Orders itm = product.fullFillOrder();
               }

            });
            t2.start();
        }
    }

}
