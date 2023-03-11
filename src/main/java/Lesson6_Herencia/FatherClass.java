package Lesson6_Herencia;

import javax.swing.JOptionPane;

public class FatherClass {
    String oficio;

    public FatherClass(String oficio) {
        this.oficio = oficio;
    }
    
    public void cookieMake(){
        JOptionPane.showMessageDialog( 
                null, 
                ("Hago Galletas (" + this.oficio + ")")
        );
    }
}
