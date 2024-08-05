package Aula06;

import java.util.Scanner;

public class raiz_quadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = scn.nextInt();
		
		System.out.print("A raiz quadrada = " + (int)Math.sqrt(num));
	}

}
