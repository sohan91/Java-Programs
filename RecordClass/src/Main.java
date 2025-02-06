public  class Main{
    public static void main(String[] args) {
        for(int i=1;i<=6;i++) {

      EmplyeesDetails obj = new EmplyeesDetails("23915A720"+i,
                    switch (i)
                    {
                        case 1: yield  "Sohan Prasad";
                        case 2:yield "Vamshika";
                        case 3 : yield "Arjun";
                        case 4 : yield "Venkatesh";
                        case 5 :yield "Saroj";
                        case 6:yield "Vamshi";
                        default:yield "No one else";
                    }, "5/06/2024","Java Full Satck");
            System.err.println(obj.toString());
            System.out.println(obj.name()+" is registered in "+obj.subject());
        }
    }
}