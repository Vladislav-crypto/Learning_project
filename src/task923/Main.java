package task923;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/asciitable.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = 0;
        int i = 0;
        while((c = fileInputStream.read()) != -1){
            if (c >='0' && c <= '9')
                i++;
        }
        System.out.println(i);
        fileInputStream.close();
    }
}
