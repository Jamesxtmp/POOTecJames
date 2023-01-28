package Lesson1;

import java.util.Scanner;

public class MathOperaciones {

    int valor1;
    int valor2;

    public void suma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------SUMA-------");
        System.out.print("Valor1: ");
        valor1 = sc.nextInt();
        System.out.print("Valor2: ");
        valor2 = sc.nextInt();
        System.out.println("Resultado: " + (valor1 + valor2));
    }

    public void resta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------RESTA------");
        System.out.print("Valor1: ");
        valor1 = sc.nextInt();
        System.out.print("Valor2: ");
        valor2 = sc.nextInt();
        System.out.println("Resultado: " + (valor1 - valor2));
    }

    public static void main(String[] args) {
        MathOperaciones math1 = new MathOperaciones();
        math1.suma();
        math1.resta();

    }
}
