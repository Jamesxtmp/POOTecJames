package Lesson3;

import java.util.Scanner;

public class SumaReturn {
    int a,b,resultado;
    
    public int Suma(){
        resultado = a + b;
        return resultado;
    }
    public void setDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("[1] Valor: ");
        a = sc.nextInt();
        System.out.print("[2] Valor: ");
        b = sc.nextInt(); 
        
    }
    public static void main(String[] args) {
        SumaReturn SmRt = new SumaReturn();
        SmRt.setDatos();
        System.out.println("El resultado es: " + SmRt.Suma() );
    }
}
