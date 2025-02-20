import java.io.*;
import java.util.Scanner;

public class FileHndlingInputOperation {
    public static void main(String[] args) throws IOException {
        File fl = new File("./test2.tex");
                        //        if(fl.exists())
                        //        {
//                                    FileInputStream name = new FileInputStream(fl);
                        //            String var = new String("");
                        //            int ascicode;
                        //            while((ascicode= name.read())!=-1)
                        //            {
                        //                var+=(char)ascicode;
                        //
                        //            }
                        //            System.out.println(var);
                                fl.createNewFile();
        //USING SCANNER CLASS TO REAFD OPERATION
//INE BY LINE
                                          //  sc.close(); System.out.println(fl.createNewFile());
                                    //        System.out.println(fl.setReadable(true));
                                    //        Scanner sc = new Scanner(fl);
                                    //        String name = new String("");
                                    //        while(sc.hasNext())
                                    //        {
                                    //            name+=sc.nextLine() + "\n";
                                    //
                                    //        }
                                    //        System.out.println(name);
        //        //USING FILEREAD OPERATION
        //IT EXTENDS THE FILEINPUTSTREAM
        //CAHR BY CHAR IT WILL READ
                                    //
                                    //        FileReader fr = new FileReader(fl);
                                    //        String name = new String("");
                                    //        int asci;
                                    //        while((asci = fr.read())!=-1)
                                    //        {
                                    //            name+= (char)asci;
                                    //        }
                                    //        System.err.println(name);
                                    //        fr.close();
      //USING BUFFERREADER OPERATION
       //IT USE TO LINE BY AND CHAR ALSO

//        BufferedReader br = new BufferedReader(new FileReader(fl));
//        br.read();
//        int asci;
//        String name = new String("");
//        while((asci = br.read()) != -1) {
//            name+=String.valueOf((char)asci);
//           // System.out.println((char)asci);
//        }
//
//        System.out.println(name);
//        br.close();

     //ANOTHER METHOD BY USING BUFFER METHOD

        BufferedReader br = new BufferedReader(new FileReader(fl));
        String name = new String();
        String name2 = new String();
        while((name = br.readLine())!=null)
        {
            name2+= name +"\n";
        }
        System.out.println(name);
        br.close();
        //fl.close();





    }
}
