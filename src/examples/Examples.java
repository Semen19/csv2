package examples;

import java.io.*;

public class Examples {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File ("NewFile.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Value 1");
            pw.println("100");
            pw.println("300");
            pw.println("Value 2");
            pw.println("200");
            pw.println("400");
            pw.println("Value 3");
            pw.println("123");
            pw.println("500");
            pw.close();

            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
            }
        } catch (IOException e) {
            System.out.println("Error:" + e);
        } finally {
            try {
                br.close();
            } catch(IOException e) {
                System.out.print ("Error:" + e);
            }
        }

    }
}
