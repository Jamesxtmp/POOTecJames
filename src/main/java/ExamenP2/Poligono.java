package ExamenP2;

import java.util.Scanner;

public class Poligono {
    double base;
    double altura;
    double area;
    
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la base: ");
        this.base = sc.nextDouble();
        System.out.println("Ingresa la altura");
        this.altura = sc.nextDouble();
    }
    
    public void calcularArea(){}
}
