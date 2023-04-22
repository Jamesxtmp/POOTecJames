package ExamenP2;
public class Rectangulo extends Poligono{

    @Override
    public void calcularArea() {
        area = base * altura;
        System.out.println("El area del rectangulo es: "
                + area );
    } 
}
