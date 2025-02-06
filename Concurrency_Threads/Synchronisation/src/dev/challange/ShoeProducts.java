package dev.challange;

import java.util.ArrayList;
import java.util.List;

public class ShoeProducts {
    private List<Orders> items;
  public static final String[] produtTyep =
          {
            "RUNNING","HIGH HEALS","FASHION","DAILY WEAR"
          };
  public ShoeProducts()
  {
      this.items = new ArrayList<>();
  }

  public synchronized void reciverOrder(Orders item)
  {
      while (items.size() > 20) {
          try {
              wait();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
          items.add(item);
          System.out.println("Incomming Order : "+item);
          notifyAll();
  }

  public synchronized Orders fullFillOrder() {
      while (items.isEmpty()) {
          try {
              wait();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }

      Orders item = items.remove(0);
      System.out.println("FullFill Order : "+item);

      return item;
  }
}
