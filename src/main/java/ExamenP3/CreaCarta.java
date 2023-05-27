package ExamenP3;

import java.io.FileOutputStream;
import java.io.IOException;

class CreaCarta {

    public static void main(String args[]) throws IOException {
        int c;
        FileOutputStream f = new FileOutputStream("src/main/java/ExamenP3/carta.txt");
        while ((c = System.in.read()) != -1) {
            f.write(c);
        }
        f.close();
    }
}
