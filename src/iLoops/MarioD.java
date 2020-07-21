package iLoops;

import libs.Input;

public class MarioD {
    public static void main(String[] args) {

        System.out.print("Que altura quieres? ");
        int altura = Input.get_int();
        if (altura > 1) {
            for (int num = 0; num < altura; num++) {
                String imprime = "";
                String in = "";
                String in2 = "";
                in = new String(new char[num + 1]).replace("\0", "#");
                imprime = new String(new char[altura - num]).replace("\0", " ");
                in2 = new String(new char[num + 1]).replace("\0", "#");
                imprime = imprime + in + " " + in2;
                System.out.println(imprime);
            }
        } else {
            System.out.print("valor invalido, ingrese valor positivo mayor a 1");
        }
    }
}
