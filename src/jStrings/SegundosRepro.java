package jStrings;

import libs.Input;

public class SegundosRepro {
    public static void main(String[] args) {

        Input.print("Introducir minutos y segundos de duracion en formato mm:nn  ");
        String s = Input.get_string();
        String[] m = s.split(":");
        if (m.length == 2) {
            int posicionMinuto = m.length - m.length;
            int posicionSegundo = m.length - 1;
            int minuto = Integer.parseInt(m[posicionMinuto]);
            int segundo = Integer.parseInt(m[posicionSegundo]);

            if ((minuto >= 60)) {
                System.out.println("Favor de ingresar datos menores a 60 minutos o 60 segundos formato mm:ss ");

            } else{
                 if(segundo < 60){
                     int calculoMinuto = minuto * 60;
                     int calculoTotal = calculoMinuto + segundo;
                     System.out.println("La duracion en segundos es: " + calculoTotal);
                 }else{
                     System.out.println("Favor de ingresar datos menores a 60 minutos o 60 segundos formato mm:ss ");
                 }
            }

        } else {
            System.out.println("Ingresa minutos y segundos formato mm:nn ");
        }




    }

}
