// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

package LogicaEmJava;

import java.util.Scanner;

public class exerc_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scn.nextInt();
		
		System.out.println("O numero digitado foi: " + numero);
		
		scn.close();

	}

}
