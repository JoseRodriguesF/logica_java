//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
package LogicaEmJava;

import java.util.Scanner;

public class exerc_10 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scn.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        
        scn.close();
    }
}

