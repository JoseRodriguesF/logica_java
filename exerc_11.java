package LogicaEmJava;

import java.util.Scanner;

public class exerc_11 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
    
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scn.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scn.nextInt();
        
        System.out.println("Digite um número real: ");
        double num3 = scn.nextDouble();
        
        int produto = (num1 * 2) * (num2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + produto);
        
        double soma = (num1 * 3) + num3;
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
        
        double cubo = Math.pow(num3, 3);
        System.out.println("O terceiro número elevado ao cubo é: " + cubo);
        
        scn.close();
    }
}
