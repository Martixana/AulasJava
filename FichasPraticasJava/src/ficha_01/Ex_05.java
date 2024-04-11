package ficha_01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que calcule a média de 3 valores introduzidos pelo utilizador. Deverá apresentar também a média ponderada tendo em conta as seguintes ponderações: 20%. 30%, 50%.

        //declaracao variáveis
        double  valorA, valorB, valorC, avg, avg_pon;

        //ler valorA
        System.out.println("Bom dia! Insira um número inteiro");
        valorA = input.nextInt();

        // Ler valorB
        System.out.println("Insira outro número inteiro");
        valorB = input.nextInt();

        // Ler valorC
        System.out.println("Insira um terceiro número inteiro");
        valorC = input.nextInt();

        //Calcular a média
        avg = (valorA + valorB + valorC)/3;

        //Calcular a média ponderada
        avg_pon = (valorA * 0.2) + (valorB * 0.3) + (valorC * 0.5);

        // Apresentar resultado
        System.out.println("A média dos seus valores é" + " " + avg + " " + " e a média ponderada é " + " " + avg_pon );


    }
}
