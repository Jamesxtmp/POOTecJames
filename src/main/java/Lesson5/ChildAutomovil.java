package Lesson5;

public class ChildAutomovil extends FatherVehiculo{
    String marca;

    public ChildAutomovil(String marca, int numeroRuedas) {
        super(numeroRuedas);
        this.marca = marca;
    }
    
    public void encender(){
        System.out.println("Encendiendo...");
        super.acelerar();
    }
    public void presentar(){
        System.out.println("Auto modelo: " + this.marca);
        System.out.println("Con: " + this.numeroRuedas + " ruedas");
    }
    
    public static void main(String[] args) {
        ChildAutomovil auto = new ChildAutomovil("Audi", 4);
        auto.presentar();
        auto.encender();
    }
}
