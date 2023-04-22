package Lesson9;


/*public class TryCatch {
    public static void main(String[] args) {
        try {
            // Código que podría generar una excepción
            int resultado = dividir(10, 0); // Intentamos dividir 10 entre 0
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción ArithmeticException
            System.out.println("¡Error! No se puede dividir por cero.");
        } finally {
            // Bloque opcional finally
            System.out.println("El bloque finally se ejecuta siempre.");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador; // Esta línea puede generar una excepción
    }
}*/


public class TryCatch {
    public static void main(String[] args) {
        
        
        
        try {
            // Código que podría generar una excepción
            int resultado = (int) Math.sqrt(-1);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo de la excepción ArithmeticException
            System.out.println("¡Error! No se puede dividir por cero."+ e.getMessage());
        } catch (NullPointerException e) {
            // Manejo de la excepción NullPointerException
            System.out.println("¡Error! Se encontró una referencia nula.");
        } catch (Exception e) {
            // Manejo de otras excepciones que heredan de Exception
            System.out.println("¡Error! Ocurrió una excepción: " + e.getMessage());
        } catch (Error e) {
            // Manejo de errores que heredan de Error
            System.out.println("¡Error! Ocurrió un error: " + e.getMessage());
        } finally {
            // Bloque opcional finally
            System.out.println("El bloque finally se ejecuta siempre.");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador; // Esta línea puede generar una excepción
    }
    
    
    
    
}