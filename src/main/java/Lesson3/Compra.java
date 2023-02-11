package Lesson3;

import java.util.Scanner;

public class Compra {
    double costo;
    public double descuento(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de la Compra: ");
        costo = sc.nextDouble();
        if( costo >= 5000 ){
            return costo - (costo * .13);
        }else{
            return costo - (costo * .07);
        }
    }
    public static void main(String[] args) {
        Compra operacion = new Compra();
        System.out.println("Costo con descuento: " + operacion.descuento());
    }
}