public class MainOfConstructor {
    private String name;
    private double limit;
    private String emailAddress;

    public MainOfConstructor() {
        this("Sohan",784866);
        //System.out.println("The customer with 0 args is Sohan");
    }

    public MainOfConstructor(String name, double limit, String emailaddress) {
        this.name = name;
        this.limit = limit;
        this.emailAddress = emailaddress;
    }

    public MainOfConstructor(String name, double limit) {
this(name ,limit,"hstiurh@stbfdg");
        this.name =name;
        this.limit=limit;
        //System.out.println("The customer with the two args  is mani");
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
