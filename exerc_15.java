package LogicaEmJava;

import java.util.Scanner;

public class exerc_15{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o valor do lado a: ");
		double ladoA = scn.nextDouble();
		
		System.out.print("Digite o valor do lado b: ");
		double ladoB = scn.nextDouble();
		
		System.out.print("Digite o valor do lado c: ");
		double ladoC = scn.nextDouble();
		
		if(ladoA == ladoB && ladoB == ladoC) {
			System.out.print("Triângulo equilátero");
		}
		else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
			System.out.print("Triângulo isósceles");
		}
		else {
			System.out.print("Triângulo escaleno");			
		}
		scn.close();
	}
}