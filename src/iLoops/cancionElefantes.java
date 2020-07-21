package iLoops;

import libs.Input;

public class cancionElefantes {

    public static void main(String[] args) {
        int numElefante = 1;
        while (numElefante <= 100) {
            if (numElefante == 1) {
                Input.print(numElefante + " Elefante se columpiaba sobre la tela de una araña,\n como veia que resistia, fue a llamar a otro elefante. \n");
                numElefante++;
            } else {
                Input.print(numElefante + " Elefantes se columpiaban sobre la tela de una araña,\n como veian que resistia, fueron a llamar a otro elefante. \n");
                numElefante++;
            }
        }
    }
}