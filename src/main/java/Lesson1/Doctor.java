package Lesson1;

import java.util.Scanner;

public class Doctor {

    String nombre;
    String especialidad;
    int cedula;
    int telefono;

    public void sayhorario() {
        System.out.println("\n-------HORARIO-------");
        System.out.println("Horario de Atencion:");
        System.out.println("-> Lunes a Viernes");
    }

    public void setDatos() {
        System.out.println("\n----INGRESAR DATOS----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = sc.next();
        System.out.print("Cedula: ");
        cedula = sc.nextInt();
        System.out.print("Especialidad: ");
        especialidad = sc.next();
        System.out.print("Telefono: ");
        telefono = sc.nextInt();
    }

    public void sayDatos() {
        System.out.println("\n---DATOS INGRESADOS---");
        System.out.println("El Nombre del doctor es: \"" + nombre + "\"");
        System.out.println("Su Cedula: \"" + cedula + "\"");
        System.out.println("Su Telefono: \"" + telefono + "\"");
        System.out.println("Su Especialidad: \"" + especialidad + "\"");
    }

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();
        doctor1.setDatos();
        doctor1.sayDatos();
        doctor1.sayhorario();

        Doctor doctor2 = new Doctor();
        doctor2.setDatos();
        doctor2.sayDatos();
        doctor2.sayhorario();
    }
}
