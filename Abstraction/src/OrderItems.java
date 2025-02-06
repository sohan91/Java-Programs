public class OrderItems extends ProductForSale {

   public OrderItems(String type,String description,double price)
   {
       super(type,description,price);
   }

    public void showDetails()
    {
        System.out.println("The Product "+type+" is Very Healthy product");
         System.out.printf("Totoal Amount For given Number of Items are $%6.2f\n",getSalesPrice(8));
        System.out.println(description);
        System.out.println("_".repeat(40));
    }
}