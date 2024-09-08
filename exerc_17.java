//2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e
//escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.

package LogicaEmJava;

import java.util.Scanner;

public class exerc_17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int nrHomens = 0;
        int nrMulheres = 0;
        double[] alturas = new double[10];
        double somaAlturasHomens = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("1-Homem\n2-Mulher\n\nDigite: ");
            int sexo = scn.nextInt();

            if (sexo == 1) {

                System.out.println("Qual sua altura: ");
                double altura = scn.nextDouble();
                alturas[i] = altura;
                nrHomens++;
                somaAlturasHomens += altura;

                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                }

            } else if (sexo == 2) {
                nrMulheres++;
            } else {
                System.out.println("Escolha uma opção válida!!!!");
                i--; 
            }
        }

        double mediaAlturaHomens = 0;
        if (nrHomens > 0) {
            mediaAlturaHomens = somaAlturasHomens / nrHomens;
        }

        System.out.println("Número de mulheres no grupo: " + nrMulheres);
        System.out.println("Número de homens no grupo: " + nrHomens);
        System.out.println("Maior altura do grupo: " + maiorAltura);
        System.out.println("Menor altura do grupo: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);

        scn.close();
    }
}