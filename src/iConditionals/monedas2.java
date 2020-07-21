package iConditionals;

import libs.Input;

public class monedas2 {
    public static void main(String[] args) {
        System.out.print("Cuanto cambio te debo? ");
        double cambio = Input.get_double();
        if (cambio >= 0) {
            double v = cambio / .25;
            double sv = cambio - ((int) v * .25);
            System.out.println("Monedas devueltas " + "\n");
        }
        else {
            System.out.print("valor invalido, ingrese valor valido");
        }
    }

}
