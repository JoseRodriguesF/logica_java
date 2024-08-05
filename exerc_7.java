//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
package LogicaEmJava;

import java.util.Scanner;

public class exerc_7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o comprimento dos lados do quadrado em metros: ");
		double lado = scn.nextDouble();
		
		System.out.println("A área do quadrado é "+ Math.pow(lado, 2)+" Metros");
		
		scn.close();
	}

}
