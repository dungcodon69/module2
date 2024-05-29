package session_io_textfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String path){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.valueOf(line));
            }
            bufferedReader.close();
        } catch (Exception e){
            System.out.println("Not found");
        }
        return numbers;
    }
    public int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0;i  < numbers.size(); i++) {
            if (numbers.get(i) > max) max = numbers.get(i);
        }
        return max;
    }

    public void writeFile(String path, int max){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/session_io_textfile/numbers.txt");
        int maxValue = readAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("src/session_io_textfile/result.txt",maxValue);

    }
}
