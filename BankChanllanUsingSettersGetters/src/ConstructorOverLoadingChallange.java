public class ConstructorOverLoadingChallange {
    public static void main(String[] args) {
MainOfConstructor customer = new MainOfConstructor();
System.out.println(customer.getName());
System.out.println(customer.getLimit());
System.out.println(customer.getEmailAddress()+"\n");

MainOfConstructor customer2 = new MainOfConstructor("Mani",80000);
        System.out.println(customer2.getName());
        System.out.println(customer2.getLimit());
        System.out.println(customer2.getEmailAddress()+"\n");

  MainOfConstructor customer3 = new MainOfConstructor("Latha",184574,"lashfsag@gamil.com") ;
        System.out.println(customer3.getName());
        System.out.println(customer3.getLimit());
        System.out.println(customer3.getEmailAddress()+"\n");
    }
}
