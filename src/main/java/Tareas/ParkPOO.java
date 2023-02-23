package Tareas;

public class ParkPOO {
    int naranjas, limones, manzanas;

    public ParkPOO(int naranjas, int limones, int manzanas) {
        this.naranjas = naranjas;
        this.limones = limones;
        this.manzanas = manzanas;
    }

    public String contarArboles( String variedad ){
        String msj = "";;
        switch (variedad) {
            case "N":
                msj = "Cantidad de naranjas: " + this.naranjas;
                break;
            case "L":
                msj = "Cantidad de limones: " + this.limones;
                break;
            case "M":
                msj = "Cantidad de manzanas: " + this.manzanas;
                break;
            case "ALL":
                msj = "Cantidad de arboles: " + (this.naranjas + this.limones + this.manzanas);
                break;
            default:
                msj = "Opcion invalida";
        }
        return msj;
    }
    
    
    public static void main(String[] args) {
        ParkPOO myPark = new ParkPOO(52, 65, 2);
        
        String conteo = "";
        String variedad = "ALL";
        conteo = myPark.contarArboles(variedad);
        
        System.out.println(conteo);
        
    }
}
