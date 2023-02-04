package Lesson2;
import java.util.Scanner;

public class AreaPerimetroTriangulo {
    double b, h, l1, l2, l3;
    
    public void calcArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor base: ");
        b = sc.nextDouble();
        System.out.print("\nValor altura: ");
        h = sc.nextDouble();
        System.out.print("\nEl area es: " + ((b*h)/2));
    }
    public void calcPerimetro(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor lado 1: ");
        l1 = sc.nextDouble();
        System.out.print("Valor lado 2: ");
        l2 = sc.nextDouble();
        System.out.print("Valor lado 3: ");
        l3 = sc.nextDouble();
        System.out.print("\nEl Perimetro es: " + ((b*h)/2));
    }
}
