package jStrings;

import libs.Input;

public class ConvertiorFecha {

    public static void main(String[] args) {

        //pedir fecha
        //imprimir mes dia año

        System.out.println("Ingrese Fecha dd/mm/aaaa");
        String fecha = Input.get_string();
        String[] fechaEnPartes = (fecha.split("/"));

        System.out.println("dia " + fechaEnPartes[0]);
        System.out.println("mes " + fechaEnPartes[1]);
        System.out.println("anio " + fechaEnPartes[2]);
    }

}
