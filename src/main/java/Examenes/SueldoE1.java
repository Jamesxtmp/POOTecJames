package Examenes;

import java.util.Scanner;

public class SueldoE1 {

    int sueldoBase;
    int horasExtra;
    int sueldoAPagar;
    String nombre;

    public SueldoE1(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int pedirDatos(int horasExtra, String nombre) {
        this.horasExtra = horasExtra;
        this.nombre = nombre;
        return this.horasExtra;
    }

    public void caulcularSueldo() {
        int mas5h = 250;
        int menos5h = 200;
        if (horasExtra >= 5) {
            this.sueldoAPagar = this.sueldoBase + (this.horasExtra * mas5h);
        } else {
            this.sueldoAPagar = this.sueldoBase + (this.horasExtra * menos5h);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;

        SueldoE1 empleado1 = new SueldoE1(3000);
        System.out.print("Tu nombre es: ");
        nombre = sc.next();
        empleado1.pedirDatos(6, nombre);
        empleado1.caulcularSueldo();
        System.out.println(empleado1.nombre + " tu sueldo es de: " + empleado1.sueldoAPagar);

        SueldoE1 empleado2 = new SueldoE1(3000);
        System.out.print("Tu nombre es: ");
        nombre = sc.next();
        empleado2.pedirDatos(3, nombre);
        empleado2.caulcularSueldo();
        System.out.println(empleado2.nombre + " tu sueldo es de: " + empleado2.sueldoAPagar);

    }
}
