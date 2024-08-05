package Aula06;

import java.util.Scanner;

public class somar_dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o valor do número 1: ");
		int num1 = scn.nextInt();
		
		System.out.print("Digite o valor do número 2: ");
		int num2 = scn.nextInt();
		
		//int soma = num1 + num2
		
		System.out.print("Soma = " + (num1 + num2));

	}

}
