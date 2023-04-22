package ExamenP2;
public class Triangulo extends Poligono{
      @Override
    public void calcularArea() {
        this.area = (base * altura)/2;
        System.out.println("El area del triangulo es: "
                + this.area );
    }
}
