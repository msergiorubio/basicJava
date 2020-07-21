package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // funcion para imprimir en consola
	    int x = Input.get_int(); // sollicita parametro entero y alamacena el valor en la variable x
	    
	    // prompt user for y
	    System.out.print("y is: "); //imprime en la consola el mensaje
	    int y = Input.get_int(); //solicita parametro entero y lo alamacena en la variable y
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n"); // fusiona el mensaje de la suma es: con la suma de las variables x + y y lo imprime en la consola
	}
}