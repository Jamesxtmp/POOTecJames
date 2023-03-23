package Lesson7;

public class PrincipalFigura {
    public static void main(String[] args) {
        FiguraRectangulo fRect = new FiguraRectangulo();
        FiguraTriangulo fTria = new FiguraTriangulo();
        
        System.out.println("> Ejecucion RECTANGULO");
        fRect.ingresoDatos(50, 50);
        fRect.calculoArea();
        
        System.out.println("> Ejecucion TRIANGULO");
        fTria.ingresoDatos(50, 50);
        fTria.calculoArea();
        
    }
}
