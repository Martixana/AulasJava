package ficha_05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavéis
        int[][] matriz = new int[3][3], soma, initial_num;

        //ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("insira um número na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }   //imprimir a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

    }
}
