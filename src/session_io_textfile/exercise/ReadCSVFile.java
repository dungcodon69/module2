package session_io_textfile.exercise;

import java.io.*;

public class ReadCSVFile {
    public static void main(String[] args) {
        File file = new File("src/session_io_textfile/exercise/content.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.printf("%-10s%-10s%s","ID","Code","Name");
            System.out.println();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] arr = line.split(",");
                for (String s : arr){
                    System.out.printf("%-10s",s);
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
