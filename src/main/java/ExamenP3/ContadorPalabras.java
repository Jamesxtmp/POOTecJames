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

public class ContadorPalabras {

    //
    public static int contarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        String[] palabras = texto.split("\\s+"); // Divide el texto en palabras usando espacios en blanco como separadores
        return palabras.length;
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
                int palabrasTotal = 0;
                
                while ((line = bufferedReader.readLine()) != null) {
                    textArea.append(line + "\n");
                    //
                    palabrasTotal += contarPalabras(line);
                }
                bufferedReader.close();

                JScrollPane scrollPane = new JScrollPane(textArea);
                option = JOptionPane.showConfirmDialog(null, scrollPane, "Editar archivo", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {
                    FileWriter fileWriter = new FileWriter(filePath);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(textArea.getText());
                    bufferedWriter.close();

                    //
                    JOptionPane.showMessageDialog(null, "Archivo guardado exitosamente.\nPalabras: " + palabrasTotal);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al abrir o guardar el archivo: " + e.getMessage());
            }
        }
    }
}
