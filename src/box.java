import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class box {
    public static void main(String[] args) {
        File fileExtract = new File("D:\\C\\Desktop\\Imp\\Projects\\Gala\\img\\Wipers");

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
            fw = new FileWriter("D:/C/Desktop/a.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            String data;
            data = "product = [ \n";
            for(int i = 0; i < fileExtract.listFiles().length; i++){
                data = data + "\t{\n" +
                        "\t\t\"name\": \"\",\n" +
                        "\t\t\"image\": \"../img/Wipers" +
                        "/" + fileExtract.listFiles()[i].getName().toString() + "\"\n" +
                        "\t},\n";
            }

            data = data + "]";
            pw.println(data);

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
