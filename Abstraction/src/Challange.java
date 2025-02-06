import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product)
{

}
public class Challange {
    private static ArrayList<ProductForSale> product = new ArrayList<>();

    public static void main(String[] args) {
        product.add(new OrderItems("Eggs", "Eggs are very rich in  protiens", 20));
        product.add(new OrderItems("This Oil is Extracted from the Sun Flower", "good and purified oil", 150));
        listProducts();

        System.out.println("\n Order 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,3);
        printOrders(order1);
    }

    public static void listProducts() {
        for (var item : product) {
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,int quantity)
    {
        order.add(new OrderItem(quantity,product.get(orderIndex)));
    }
    public static  void printOrders(ArrayList<OrderItem> order)
    {
        double salesTotal = 0;
        for(var item : order)
        {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f\n",salesTotal);
    }

}
