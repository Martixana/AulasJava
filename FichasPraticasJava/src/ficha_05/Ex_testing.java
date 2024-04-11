package ficha_05;

import java.util.Scanner;
public class Ex_testing {
    public static void main (String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        //declarar variáveis
        int[][] matriz = new int[3][3];
        int melhor_mes, pior_mes;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira um número na matriz[" + linha + "][" + coluna + "]:");
                matriz[linha][coluna] = input.nextInt();

            }
        }
            for (int linha = 0; linha < matriz.length; linha++){
                for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                    System.out.print(matriz[linha][coluna]+ "\t");

                }
                System.out.println();
                }

            int soma=0;
            int contador= matriz.length*matriz[0].length;

            for (int linha = 0; linha < matriz.length; linha++){
                for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                    //soma = soma + matriz[linha][coluna];




            }

        }
       System.out.print(contador);



        }
    }


