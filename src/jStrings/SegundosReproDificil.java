package jStrings;

import libs.Input;

public class SegundosReproDificil {
    public static void main(String[] args) {
        Input.print("Intoducir duración en segndos: ");
        int s = Input.get_int();
        if(s > 0){
            int minutos = s / 60;
            int segundos = s % 60;

            System.out.println("La cancion dura: " + minutos + " minutos y " + segundos + " segundos");
        }else{
            System.out.println("Favor de ingresar valores positivos. ");
        }




    }

}
