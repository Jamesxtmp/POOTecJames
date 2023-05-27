package ExamenP3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EditorTexto {

    //Cree una funcion Para invertir una cadena de texto
    public static String invertirCadena(String cadena) {
        char[] arreglo = cadena.toCharArray();
        String resultado = "";

        for (int i = arreglo.length - 1; i >= 0; i--) {
            resultado += arreglo[i];
        }
        return resultado;
    }

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser();
        JTextArea textArea = new JTextArea();

        int option = fileChooser.showOpenDialog(null);

        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
                bufferedReader.close();

                JScrollPane scrollPane = new JScrollPane(textArea);
                option = JOptionPane.showConfirmDialog(null, scrollPane, "Editar archivo", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    FileWriter fileWriter = new FileWriter(filePath);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(textArea.getText());

                    bufferedWriter.close();
                    
                    String lineInvertida;
                    String textoInvertido = "";
                    
                    
                    bufferedReader = new BufferedReader(new FileReader(filePath));
                    //agrego nuevas variables String para almacenar mis cadenas invertidas
                    
                    while ((line = bufferedReader.readLine()) != null) {
                        //Hago uso de mi funcion Invertidora por cada linea del texto
                        lineInvertida = invertirCadena(line);
                        //Almaceno todas las lineas invertidas
                        textoInvertido += (lineInvertida + "\n");
                    }
                    bufferedReader.close();

                    //Modifique el Mensaje de Guardado para que muestre el Texto Invertido
                    JOptionPane.showMessageDialog(null, "Archivo guardado exitosamente.\nTexto Invertido: \n" + textoInvertido);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al abrir o guardar el archivo: " + e.getMessage());
            }
        }
    }
}
