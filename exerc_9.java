package Aula06;

import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = scn.nextInt();
		
		//int potencia = (int)Math.pow(num, 2);
		
		System.out.println("O número elevado ao quadrado = " + (int)Math.pow(num,  2));		
	}
}