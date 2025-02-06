public abstract class ProductForSale {
    protected String type;
    protected String description;
    protected double price;

    public ProductForSale(String type,String description,double price)
    {
        this.type = type;
        this.description = description;
        this.price = price;
    }
    public  double getSalesPrice(int quantity)
    {
        return quantity*price;
    }
    public void printPricedItem(int quantity) {
        System.out.printf("%2 qty at $%8.2f each, %-15s %-35s %n",price,type,description);
    }
    public  abstract  void showDetails();
}

