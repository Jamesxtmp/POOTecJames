package Examenes;

public class TrabajadorE1 {
    // Declaración de atributos
    String nombre;
    int horasBase;
    int horasExtra;
    int sueldoBase = 3000;
    
    // Declaración de constructor con un parámetro
    public TrabajadorE1(String nombre) {
        this.nombre = nombre;
    }
    
    // Declaración de método para calcular el sueldo total
    public int calcularSueldoTotal() {
        int sueldoExtra;
        if (horasExtra <= 5) {
            sueldoExtra = horasExtra * 200;
        } else {
            sueldoExtra = 5 * 200 + (horasExtra - 5) * 250;
        }
        return sueldoBase + horasBase * 200 + sueldoExtra;
    }
    
    // Declaración de método para imprimir la información del trabajador
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas base: " + horasBase);
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Sueldo total: " + calcularSueldoTotal());
    }
    
    // Declaración de método para establecer las horas base y las horas extra
    public void establecerHoras(int horasBase, int horasExtra) {
        this.horasBase = horasBase;
        this.horasExtra = horasExtra;
    }
    
    // Declaración de método main para probar la clase
    public static void main(String[] args) {
        TrabajadorE1 trabajador1 = new TrabajadorE1("Juan");
        trabajador1.establecerHoras(40, 5);
        trabajador1.imprimirInformacion();
        
        TrabajadorE1 trabajador2 = new TrabajadorE1("María");
        trabajador2.establecerHoras(45, 10);
        trabajador2.imprimirInformacion();
    }
}
