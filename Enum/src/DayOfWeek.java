import java.security.SecureRandomSpi;
import java.util.Random;

public class DayOfWeek {
    public static void main(String[] args) {
        Days dayOfWeek = Days.MON;
        System.out.println(dayOfWeek);
        for (int i = 0; i < 10; i++) {
           dayOfWeek = getVale();
//            System.out.println("day is " + dayOfWeek.name()+ " value is " +dayOfWeek.ordinal());//ordinal for to return the index value
//            if(dayOfWeek == Days.SAT)
//            {
//                System.out.println("Saturday got match");
//            }
            getIntDay(dayOfWeek);
        }
    }
    public static void getIntDay(Days d)
    {
        int dayNum = d.ordinal()+1;
        switch(d) {
            case MON -> System.out.println("Saturday day is " + dayNum);
            case WEDN -> System.out.println("Wednesday day is "+dayNum);
            default -> System.out.println(d.name().charAt(0)+d.name().substring(1).toLowerCase()+"day is Day  "+dayNum);
        }
    }
    public static Days getVale()
    {
        int r = new Random().nextInt(7);
        var allDays = Days.values();
        return allDays[r];
    }
}
