public class UserInputConsole {
    public static void main(String[] args) {
        try {
            System.out.println(dateOfBirthYear(2024, "Sohan"));
        }
        catch (NullPointerException e)
        {
            System.out.println("Invalid console input form the user");
        }
    }
    public static String dateOfBirthYear(int age,String name)


    {
        String input = System.console().readLine("Hi "+name+", Welcome to Intellij");
        String datOfBirth = "2003";
        int num =age-Integer.parseInt(datOfBirth);
       // System.out.println("Age = "+num);
        return "age = "+num;
    }
}
