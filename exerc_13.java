package LogicaEmJava;

import java.util.Scanner;

public class exerc_13{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = scn.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		double altura = scn.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		if(imc <= 18.5) {
			System.out.print("Abaixo do peso");
		}
		else if(imc >= 18.6 && imc <= 24.9) {
			System.out.print("Peso ideal");
		}
		else if(imc >= 25 && imc <= 29.9) {
			System.out.print("Levemente acima do peso");
		}
		else if(imc >= 30 && imc <= 34.9) {
			System.out.print("Obesidade grau I");
		}
		else if(imc >= 35 && imc <= 39.9) {
			System.out.print("Obesidade grau II - severa");
		}
		else {
			System.out.print("Obesidade grau III - mórbida");
		}
		
		scn.close();
	}
}