// Faça um Programa que peça dois números e imprima a soma.

package LogicaEmJava;

import java.util.Scanner;

public class exerc_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um numero para soma: ");
		double numero1 = scn.nextDouble();
		
		System.out.print("Digite outro numero para a soma: ");
		double numero2 = scn.nextDouble();
		
		System.out.println("Resultado = "+(numero1 + numero2));
		
		scn.close();
		
	}

}
