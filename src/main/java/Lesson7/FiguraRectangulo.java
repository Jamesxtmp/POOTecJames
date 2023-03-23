package Lesson7;


public class FiguraRectangulo{
    double base, altura;
    
    public void ingresoDatos(double base, double altura ){
        this.base = base;
        this.altura = altura;
        System.out.println("--- Datos ingresados: "
                + "\nBase:" + this.base
                + "\nAltura: " + this.altura);
    }
    public void calculoArea(){
        double area;
        area = base * altura;
        System.out.println("El area del rectangulo es: "
                + area + "\n");
    }
}
