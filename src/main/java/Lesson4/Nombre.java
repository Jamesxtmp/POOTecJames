
package Lesson4;

import java.util.Scanner;


public class Nombre {
    String name;
    
    public Nombre(String name){
        this.name = name;
    }
    public String myName(){
        String myName = "Hola me llamo " + this.name;
        return myName;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Cual es tu Nombre?: ");
        name = sc.next();
        
        Nombre nameOb = new Nombre(name);
        System.out.println(nameOb.myName());
        
    }
}
