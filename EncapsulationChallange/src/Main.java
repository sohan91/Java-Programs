public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.println("Intial Page count "+  printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.printf("PrintPgaes : %d , Printer Total : %d\n ",pagesPrinted,printer.getPagesPrinted());
//    System.out.println("Pagesprinted  for Toner is "+printer.getPagesPrinted());
         pagesPrinted = printer.printPages(10);
        System.out.printf("PrintPgaes : %d , Printer Total : %d\n ",pagesPrinted,printer.getPagesPrinted());


    }
}
