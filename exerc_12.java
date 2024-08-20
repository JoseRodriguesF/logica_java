package LogicaEmJava;

import java.util.Scanner;

public class exerc_12 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
  
        System.out.println("Digite a sua altura em metros: ");
        double altura = scn.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        
        scn.close();
    }
}
