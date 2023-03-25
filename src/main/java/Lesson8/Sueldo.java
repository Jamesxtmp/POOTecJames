package Lesson8;

public abstract class Sueldo {
    String nombre, area;
    
    public abstract void salario();
    
    public void pedirDatos(String nombre, String area){
        this.nombre = nombre;
        this.area = area;
        System.out.println("Empledo ingresado con:"
                + "\nNombre: " + this.nombre
                + "\nArea: " + this.area);
    }
}
