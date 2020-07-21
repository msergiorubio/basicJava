package iConditionals;

import libs.Input;

import java.math.RoundingMode;

public class monedas {
    public static void main(String[] args) {

        System.out.print("Cuanto cambio te debo? ");
        double cambio = Input.get_double();
        if (cambio >= 0) {
        int monedas = 0;
        double veinticinco = cambio/.25;
        double sobrav = cambio - ((int) veinticinco * .25);
        double diez = 0;
        double sobrad = 0;
        double cinco = 0;
        double sobrac = 0;
        double uno = 0;

            if (sobrav>0) {
                diez = sobrav / .10;
                sobrad = sobrav - ((int) diez * .1);
                if (sobrad>0){
                    cinco = sobrad /.05;
                    sobrac = sobrad - ((int) cinco * .05);
                    if (sobrac>0){
                        uno = sobrac / .01;
                        uno = Math.round(uno * 1);
                    }
                }
        }
        monedas = ((int) veinticinco + (int) diez + (int) cinco + (int) uno);


            System.out.println("Monedas devueltas " + monedas);
            System.out.println("Monedas de 25c " + (int) veinticinco);
            System.out.println("Monedas de 10c " + (int) diez);
            System.out.println("Monedas de 5c " + (int) cinco);
            System.out.println("Monedas de 1c " + (int) uno);
        } else {
            System.out.print("valor invalido, ingrese valor valido");

        }
    }
}
