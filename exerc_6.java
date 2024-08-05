//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. (A = π r²)
package LogicaEmJava;

import java.util.Scanner;
import java.lang.Math;

public class exerc_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = scn.nextDouble();
		
		double area = Math.PI * (raio*2);
		
		System.out.println("Área: "+ area);
		
		scn.close();
	}

}
