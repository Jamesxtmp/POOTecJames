package Tareas;

import java.util.Scanner;

public class OperacionesBasicas {

    double a, b;
    Scanner sc = new Scanner(System.in);

    public void setVariables() {
        System.out.print("[1] Valor: ");
        a = sc.nextDouble();
        System.out.print("[2] Valor: ");
        b = sc.nextDouble();
    }
    public void suma() {
        setVariables();
        System.out.println("El resultado de la \"suma\" es: " + (a + b));
    }
    public void resta() {
        setVariables();
        System.out.println("El resultado de la \"resta\" es: " + (a - b));
    }
    public void producto() {
        setVariables();
        System.out.println("El resultado de la \"multiplicacion\" es: " + (a * b));
    }
    public void cociente() {
        setVariables();
        System.out.println("El resultado de la \"divicion\" es: " + (a / b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        OperacionesBasicas OpBs = new OperacionesBasicas(); 
        System.out.println("""
                           Elige una opcion:
                           (1) Suma
                           (2) Resta
                           (3) Multiplicacion
                           (4) Divicion: """);
        op = sc.nextInt();
    }
       
}
