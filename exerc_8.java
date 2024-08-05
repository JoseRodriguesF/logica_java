//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

package LogicaEmJava;

import java.util.Scanner;

public class exerc_8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?: ");
		double valor_hora = scn.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês: ");
		double mes_hora = scn.nextDouble();
		
		double salario = valor_hora * mes_hora;
		
		System.out.println("Valor hora: "+ valor_hora+"\nHoras trabalhadas no mes: "+mes_hora+"\nSalário: "+ salario );
		
		
		scn.close();

	}

}
