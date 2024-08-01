// Faça um Programa que converta metros para centímetros.

package LogicaEmJava;

import java.util.Scanner;

public class exerc_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite quantos metros você deseja converter em centímetros: ");
		int metros = scn.nextInt();
		
		int centimetros = metros * 100;
		
		System.out.println("centimetros: "+ centimetros);
		
		scn.close();
	}
}
