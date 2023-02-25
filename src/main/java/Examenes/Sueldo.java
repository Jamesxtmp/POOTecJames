package Examenes;

import java.util.Scanner;

public class Sueldo {
    
    // Declaracion de atributos
    int sueldoBase;
    int horasExtra;
    int sueldoAPagar;
    String nombre;

    //Constructor de la Clase con 1 parametro
    //Parametro Sueldo base
    public Sueldo(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    //Medtodo "void" Calcuala el suelo en base a las horas Extra
    //Aqui se declaran las variables para cada caso segun las horas Extra
    public void caulcularSueldo() {
        int mas5h = 250;
        int menos5h = 200;
        if (horasExtra >= 5) {
            this.sueldoAPagar = this.sueldoBase + (this.horasExtra * mas5h);
        } else {
            this.sueldoAPagar = this.sueldoBase + (this.horasExtra * menos5h);
        }
    }

    //Metodo que retorna valores y almacena el valor de algunos atributos
    public int pedirDatos(int horasExtra, String nombre) {
        this.horasExtra = horasExtra;
        this.nombre = nombre;
        return this.horasExtra;
    }

    //Metodo main
    public static void main(String[] args) {
        //Inicia metodo Scanner y la variable nombre
        Scanner sc = new Scanner(System.in);
        String nombre;
        
        //Declacion del objeto, paso de parametros y uso de los metodos
        Sueldo empleado1 = new Sueldo(3000);
        System.out.print("Tu nombre es: ");
        nombre = sc.next();
        empleado1.pedirDatos(6, nombre);
        empleado1.caulcularSueldo();
        System.out.println( empleado1.nombre +  " tu sueldo es de: " + empleado1.sueldoAPagar);
        
        //Declacion del objeto, paso de parametros y uso de los metodos
        Sueldo empleado2 = new Sueldo(3000);
        System.out.print("Tu nombre es: ");
        nombre = sc.next();
        empleado2.pedirDatos(3, nombre);
        empleado2.caulcularSueldo();
        System.out.println( empleado2.nombre +  " tu sueldo es de: " + empleado2.sueldoAPagar);
        
    }

}
