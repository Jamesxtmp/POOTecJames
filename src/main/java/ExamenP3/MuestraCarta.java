package ExamenP3;

import java.io.*;

class MuestraCarta {

    public static void main(String args[]) throws IOException {
        int c;
        FileInputStream f = new FileInputStream("src/main/java/ExamenP3/carta.txt");
        while ((c = f.read()) != -1) {
            System.out.print((char) c);
        }
        f.close();
    }
}