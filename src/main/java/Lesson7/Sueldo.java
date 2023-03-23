package Lesson7;

public class Sueldo {
    String nombre, area;
    
    public void salario(){
        double sueldo;
        sueldo = 1000 + ( 1000 * .05 );
        System.out.println("Tu sueldo +5% es: " + sueldo);
    }
    public void pedirDatos(String nombre, String area){
        this.nombre = nombre;
        this.area = area;
        System.out.println("Empledo ingresado con:"
                + "\nNombre: " + this.nombre
                + "\nArea: " + this.area);
    }
}
