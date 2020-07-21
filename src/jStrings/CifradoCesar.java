package jStrings;

public class CifradoCesar {

    public static void main(String[] args) {

        int clave = 1;
        String nombre = "HOLA";
        for(int posicion = 0; posicion < nombre.length(); posicion++) {
            char actual = nombre.charAt(posicion);
            int numeroActual = actual + clave;
            if(numeroActual > 90) {
                numeroActual = numeroActual - 26;
            }
            char letraActual = (char) numeroActual;
            System.out.print(letraActual);
        }
        System.out.println();

    }


}
