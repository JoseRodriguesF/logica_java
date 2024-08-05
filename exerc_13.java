package Aula06;

import java.util.Scanner;

public class viagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		//entrada
		System.out.print("Digite o tempo gasto na viagem: ");
		double tempo = scn.nextDouble();
		
		System.out.print("Digite a velocidade média: ");
		double velocidade = scn.nextDouble();
		
		//processamento
		double distancia = tempo * velocidade;
		double litros = distancia / 12;
		
		//saida
		System.out.println("Tempo gasto = " + tempo);
		System.out.println("Velocidade média = " + velocidade);
		System.out.println("Distância percorrida = " + distancia);
		System.out.println("Litros usados = " + litros);		
	}

}
