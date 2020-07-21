package gNumericTypes;

import libs.Input;

public class Botellas {
    public static void main(String[] args) {
        System.out.print("Botellas por minuto 12:" + "\n");

        System.out.print("ingresa minutos: "); //imprime en la consola el mensaje
        int x = Input.get_int();
           if (x >= 0) {
               System.out.println("Botellas usadas " + (x * 12) + "\n");}
           else{
               System.out.print("valor invalido, ingrese valor valido");
           }

           }
}
