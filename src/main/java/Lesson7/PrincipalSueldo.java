package Lesson7;

public class PrincipalSueldo {
    
    public static void main(String[] args) {
        System.out.println("----Ejecucion PARDRE");
        Sueldo sueldoOb1 = new Sueldo();
        sueldoOb1.pedirDatos("Jaime", "Sistemas");
        sueldoOb1.salario();
        
        System.out.println("----Ejecucion HIJO");
        SuedoChild sueldoOb2 = new SuedoChild();
        sueldoOb2.pedirDatos("Jaime", "Sistemas");
        sueldoOb2.salario();
    }
}
