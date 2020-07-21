package bHolaMundo.fHelloWorld;

import libs.Input;

public class Hello2 {

	public static void main(String args[])
	{
		System.out.println("Cual es tu nombre? ");// Esta funcion manda un mensaje a la consola
		String name = Input.get_string();// Solicita datos del usuario y lo asigna a la variable name
		System.out.println("hello, "+ name );//fusiona hola y la que tenga la variable name, y lo imprime a la consola
	}
}