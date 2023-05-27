package ExamenP3;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessBinario {
    // Crea un fichero binario con los 100 primeros numeros

    static void creaFichBin(String ruta) throws IOException {
        RandomAccessFile f = new RandomAccessFile(ruta, "rw");
        for (int i = 1; i <= 100; i++) {
            try {
                f.writeByte(i);
            } catch (IOException e) {
                // Gestion de excepcion de ejemplo
                break; // No se puede seguir escribiendo
            }
            f.close();
        }
    }

    static void imprimeEltoN(String ruta, long cual) throws IOException {
        RandomAccessFile f = new RandomAccessFile(ruta, "r"); // E/

        System.out.print("El fichero " + ruta);
        System.out.println(" ocupa " + f.length() + " bytes.");
        f.seek(cual - 1); // Me posiciono (-1 porque empieza en 0)
        System.out.print(" En la posicion " + f.getFilePointer());
        System.out.println(" esta el numero " + f.readByte());
        f.skipBytes(9); // Salto 9 =&gt; Elemento 10 mas alla
        System.out.print(" 10 elementos más allá, esta el ");
        System.out.println(f.readByte());
        f.close();
    }

    public static void main(String args[]) throws IOException {
        String ruta =  "src/main/java/ExamenP3/numeros.dat"; // Fichero
        creaFichBin(ruta); // Se crea
        imprimeEltoN(ruta, 14); // Accedo al elemento 14.
    }
}
