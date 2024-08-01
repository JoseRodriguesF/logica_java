//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

package LogicaEmJava;

import java.util.Scanner;

public class exerc_4{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = scn.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = scn.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		double nota3= scn.nextDouble();
		System.out.println("Digite a quarta nota do aluno");
		double nota4 = scn.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A media do aluno é: "+ media);
		
		scn.close();
	}

}
