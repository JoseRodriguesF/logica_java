//1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re),
//Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

package LogicaEmJava;

import java.util.Scanner;

public class exerc_16{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em graus celcius: ");
		double celsius = scn.nextDouble();
		
		double K = celsius + 273.15;
		double Re = celsius * 0.8;
		double Ra = (celsius * 1.8)+ 491.67;
		double F = (celsius* 1.8) + 32;
		
		System.out.println(Ra);	
		
		System.out.println("Graus Celsius: " + celsius);
		System.out.println("Graus Fahrenheit: " + F);
		System.out.println("Graus Réaumur: "+ Re);
		System.out.println("Graus Rankine: "+ Ra);
		System.out.println("Graus Kelvin: "+ K);
		
		scn.close();
		
	}

}
