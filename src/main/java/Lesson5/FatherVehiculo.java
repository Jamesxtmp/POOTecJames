/*
En Java, la reutilización de miembros heredados se refiere al uso de los miembros
(variables, métodos, constructores) de una clase padre en una clase hija que
hereda de la clase padre.
Para utilizar los miembros heredados en una clase hija, se puede acceder a ellos
utilizando la palabra clave "super".

Además de los métodos, se pueden reutilizar variables y constructores heredados
de la misma manera, utilizando la palabra clave "super" para hacer referencia a
la versión de la clase padre.

En resumen, la reutilización de miembros heredados en Java se logra utilizando
la palabra clave "super" para acceder a los métodos, variables y constructores de
la clase padre desde una clase hija que hereda de ella.
*/

package Lesson5;

public class FatherVehiculo {
    int numeroRuedas;

    public FatherVehiculo(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public void acelerar(){
        System.out.println("Acelerando....");
    }
    
}
