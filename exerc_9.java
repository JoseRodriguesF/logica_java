//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
package LogicaEmJava;

import java.util.Scanner;

public class exerc_9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double Fahrenheit = scn.nextDouble();
		
		System.out.println("Temperatura em celcius: "+ 5*( Fahrenheit-32)/9);
		
		scn.close();
		
	}

}
