import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String name = "NewTest.csv";
        File file = new File(name);
        File f = new File(name).getAbsoluteFile();
        System.out.println(f);
        for(File fl : File.listRoots())
        {
            System.out.println(fl);
        }
        if(!file.exists())
        {
           System.out.println("Hey...My name is Sohan!");
        }
        System.out.println("Nothing");
    }
}
