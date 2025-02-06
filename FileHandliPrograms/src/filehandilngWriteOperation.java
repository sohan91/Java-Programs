import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class filehandilngWriteOperation {
    public static void main(String[] args) throws IOException {
        File name = new File("./test.text");
        if (name.exists())
            name.delete();
        name.createNewFile();
        //BY USING FILEOUTPUTSREAM OPERATION
        //        FileOutputStream fo =new FileOutputStream(name);
        //        String filewrite = "SOHAN PRASAD";
        //       // String ch = new String();
        //        for(char ch : filewrite.toCharArray())
        //        {
        //             fo.write((int)ch);
        //        }/
        //        fo.write(90);
        //        fo.write(23);
    }
}