import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class propertiesFile {
    public static void main(String[] args) throws IOException {
        File name = new File("locateme.poperties");//properties class is extends the hashtable as hashtable extends the map
        if(!(name.exists()))
        name.createNewFile();
        Properties prop = new Properties();
        prop.setProperty("url", "gueas");//the values are store int the alphabetic in order
        prop.setProperty("UserName","sohan");
        prop.setProperty("Password","2093402u");
        FileOutputStream foer = new FileOutputStream(name);
        prop.store(foer,"Imformarion");//foer is key and Info is value
        prop.remove("url");
          FileInputStream input = new FileInputStream(name);
          prop.load(input);
         Set<String> setname=prop.stringPropertyNames();//print the list from the inputedstream
        System.out.println(setname);
       Collection<Object> sleep = prop.values();
       System.out.println(sleep);
       System.out.println("User name"+prop.getProperty("UserName"));
       System.out.println(prop.getProperty("domin"));
       System.out.println(prop);
       Set<Map.Entry<Object, Object>> data =prop.entrySet();
       System.out.println("entry set " +data);
    }

}
