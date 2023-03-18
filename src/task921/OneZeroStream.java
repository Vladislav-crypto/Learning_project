package task921;

import java.io.IOException;
import java.io.InputStream;

public class OneZeroStream extends InputStream {
    private byte[] bytes = {'1',' ','0',' '};
    int a = 0;
    @Override
    public int read() throws IOException {
        if (a>=bytes.length){
            a = 0;
        }
        return bytes[a++];
    }
}
