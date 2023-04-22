package ExamenP2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Cuantos Poligonos ingresaras:");
        n = sc.nextInt();
        
        
        Poligono[] poligonos = new Poligono[n];
        
        for (int i = 0; i < n; i++) {
            String op;
            System.out.println("[T para Tringulo] [R para Rectangulo] ");
            op = sc.next();
            
            if( op.equals("T") ){
                Triangulo triang = new Triangulo();
                triang.ingresarDatos();
                triang.calcularArea();
                poligonos[i] = triang;
            }else{
                Rectangulo rect = new Rectangulo();
                rect.ingresarDatos();
                rect.calcularArea();
                poligonos[i] = rect;
            }
        }
        System.out.println("----Todos los Poligonos----");
        for (int i = 0; i < n; i++) {         
            System.out.println("Poligono"+ (i+1) + ":\n"
                    + "Base: " + poligonos[i].base + ":\n"
                    + "Altura: " + poligonos[i].altura + ":\n"
                    + "Area: " + poligonos[i].area);
        }
    }
}
