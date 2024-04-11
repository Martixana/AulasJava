package ficha_01;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia dois números inteiros e os armazene nas variáveis valor1 e valor2. Permute o valor das variáveis e apresente o resultado. de seguida, verifique se consegue efetuar esta troca sem criar mais variáveis.

        //declaracao variáveis
        int  valor1, valor2;

        //ler valor1

        valor1= 2;

        // Ler valor2

        valor2 = 3;

        // Apresentar resultado
        System.out.println("O valor1 é:" +" " + valor1 + " " + " E o valor2 é " + " " + valor2 );

        valor1= 3;

        valor2 = 2;

        // Apresentar resultado
        System.out.println("O valor1 é:" +" " + valor1 + " " + " E o valor2 é " + " " + valor2 );



    }
}
