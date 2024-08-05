package Aula06;

import java.util.Scanner;

public class troca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		//entrada
		System.out.print("Digite o valor de A: ");
		int a = scn.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int b = scn.nextInt();
		
		//processamento
		int aux = a;
		a = b;
		b = aux;
		
		//saida
		System.out.println("O valor de A = " + a);
		System.out.println("O valor de B = " + b);
	}
}