import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class box {
    public static void main(String[] args) {
        File fileExtract = new File("***Folder Name***");

        //Check that file has been existed or not.
        System.out.println(fileExtract.exists());

        //List full path of file.
        System.out.println(fileExtract.listFiles()[0]);

        //Get File Name.
        System.out.println(fileExtract.listFiles()[0].getName());

        //Get All File Name.
        for(int i = 0; i < fileExtract.listFiles().length; i++){
            System.out.println(fileExtract.listFiles()[i].getName());
        }


        //Write data to file.

        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("***File Name***", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            for(int i = 0; i < fileExtract.listFiles().length; i++){
                pw.println(fileExtract.listFiles()[i].getName());
            }

            System.out.println("Data Successfully appended into file");
            pw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) {// can't do anything }
            }

        }

    }
}
