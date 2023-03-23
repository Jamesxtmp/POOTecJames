package Lesson7;

public class SuedoChild extends Sueldo {
    
    @Override
    public void salario(){
        double sueldo;
        sueldo = 1000 + ( 1000 * .07 );
        System.out.println("Tu sueldo +7% es: " + sueldo);
    }
}
