package Lesson11;
import java.util.Scanner;

public class cuadradoUno {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un valor entero:");
        num = teclado.nextInt();
        int cuadrado = num * num;
        System.out.println("El cuadrado de " + num + " es " + cuadrado);
    }
}