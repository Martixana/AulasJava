package ficha_01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        // Prob 1: Escreva um programa que subtraia dois números introduzidos pelo utilizador. Multiplique resultado pelo primeiro num. Apresente.

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        //declaracao variáveis
        int  num1, num2;

        // Ler num1
        System.out.println("Bom dia! Insira um número inteiro");
        num1 = input.nextInt();

        // Ler num2
        System.out.println("Insira outro número inteiro");
        num2 = input.nextInt();

        //Subtracao num1 com num2 a multiplicar por 1o numero
        double sub_multi = (num1 - num2) * num1;

        // Apresentar resultado
        System.out.println("O resutado é" + " " + sub_multi );
        

    }
}
