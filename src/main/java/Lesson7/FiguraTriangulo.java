package Lesson7;

public class FiguraTriangulo extends FiguraRectangulo{
    
    @Override
    public void calculoArea(){
        double area;
        area = ( base * altura ) / 2;
        System.out.println("El area del tringulo es: "
                + area );
    }
}
