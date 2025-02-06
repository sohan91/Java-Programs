import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectData {
    public static final String phoneData =
            """ 
            Charlie Brown, 3334445555
            Maid Marion, 1234567890
            Mickey Mouse, 9998887777
            Mickey Mouse, 1247489758
            Minnie Mouse, 4567805666
            Robin Hood, 5647893000
            Robin Hood, 7899028222
            Lucy Van Pelt, 5642086852
            Mickey Mouse, 9998887777""";
    public static final String emailData =
            """
                    Mickey Mouse, mckmouse@gmail.com
                                Mickey Mouse, micky1@aws.com
                                Minnie Mouse, minnie@verizon.net
                                Robin Hood, rhood@gmail.com
                                Linus Van Pelt, lvpelt2015@gmail.com
                                Daffy Duck, daffy@google.com""";

    public static List<Challange> getData(String type)
    {
        List<Challange> dataList = new ArrayList<>();
        Scanner sc = new Scanner(type.equals("phone")?phoneData:emailData);
        while (sc.hasNext())
        {
            String[] data = sc.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if(type.equals("phone"))
            {
                dataList.add(new Challange(data[0],Long.parseLong(data[1])));
            }
         else if(type.equals("emails"))
            {
                dataList.add(new Challange(data[0],data[1]));
            }
        }
        return dataList;
    }
}
