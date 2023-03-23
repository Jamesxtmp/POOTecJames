package Tareas.Actividad2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario;
        
        System.out.println("¿Cual es tu salario?: ");
        salario = sc.nextInt();
        
        if( salario > 10000 ){
            Gerente gerente1 = new Gerente();
            gerente1.setNombre("Jaime");
            gerente1.setSalario(salario);
            gerente1.setPuesto("Sistemas");
            gerente1.setAntiguedad(10);
            
            System.out.println("Gerente: " + gerente1.getNombre() +
                    "\nSalario: " + gerente1.getSalario() +
                    "\nPuesto: " + gerente1.getPuesto() + 
                    "\nAntiguedad: " + gerente1.getAntiguedad()
            );
        }else{
            Empleado empleado1 = new Empleado();
            empleado1.setNombre("Evelin");
            empleado1.setSalario(salario);
            empleado1.setPuesto("Diseñadora");
            System.out.println("Empleado: " + empleado1.getNombre() +
                    "\nSalario: " + empleado1.getSalario() +
                    "\nPuesto: " + empleado1.getPuesto()
            );
        }
        
        
    }
}
