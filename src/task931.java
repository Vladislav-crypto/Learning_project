import java.io.FileOutputStream;
import java.io.IOException;

public class task931 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/files/request.txt");
        fileOutputStream.write("GIVE ME THE CODE, PLEASE".getBytes());
        fileOutputStream.close();
    }
}
