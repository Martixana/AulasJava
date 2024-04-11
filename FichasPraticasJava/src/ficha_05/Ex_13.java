package ficha_05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);
//Escreva um programa que lê uma matriz de tamanho 4x4 e encontra a soma dos elementos da diagonal principal

        //declarar variáveis
        int[][] matriz = new int[4][4];
        int soma;

        //user inputs and save input
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("Insira um número na matriz (" + l + "):");
                matriz[l][c] = input.nextInt();
            }

        }
       // print matriz
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(matriz[l]==matriz[c]){
                    System.out.print(matriz[l][c] + " ");
                    }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //soma
        soma = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[l] == matriz[c]) {
                    soma = soma + matriz[l][c];

                }
            }
        }System.out.print("A soma dos quatro valores é:" + " " + soma);
    }
}
