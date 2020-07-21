package iLoops;

import com.sun.xml.internal.ws.util.StringUtils;
import libs.Input;

import java.util.stream.Stream;

import static com.sun.xml.internal.ws.util.StringUtils.*;

public class MarioF {

    public static void main(String[] args) {

        System.out.print("Que altura quieres? ");
        int altura = Input.get_int();
        if (altura > 1) {
            for(int num = 0; num < altura ; num++){
                String imprime = "";
                String in = "";
                in = new String(new char[num + 2]).replace("\0","#");
                imprime = new String(new char[altura - num]).replace("\0"," ");
                imprime = imprime + in;
                System.out.println(imprime);
            }
        }
        else {
            System.out.print("valor invalido, ingrese valor positivo mayor a 1");
        }
    }

}
