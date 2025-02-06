import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("./froj.text");//for file
        File f2 = new File("./simpman/many.text");
        //System.out.println(f2.mkdirs());for creation of multiple folders within(directories)
        System.out.println(new Date(f2.lastModified()));
        System.out.println(f2.mkdir());//creating folder
        File f3 = new File("C:\\Users\\Sohan\\JAVA_PROGRAMS");

        System.out.println(Arrays.toString(f3.listFiles()));
        System.out.println(f3.getAbsoluteFile());
        System.out.println(f3.getAbsolutePath());
        System.out.println(f3.getName());
        System.out.println(f3.getParentFile());
        File var = new File(f3.getParentFile()+"\\resume.doc");
       System.out.println(var.createNewFile());
        //if(f.exists())
            //f.delete();
      //  System.out.println(  f.createNewFile());;
        //System.out.println( f.delete());
       // System.out.println(f.isHidden());
        //System.out.println(f.canWrite());
        //f.setWritable(true);
        //System.out.println(f.canWrite());




    }
}
