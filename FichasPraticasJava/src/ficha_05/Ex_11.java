package ficha_05;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex_11 {
    public static void main(String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int maior_num, menor_num, posicao_atual;


        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("Insira um número: ");
                matriz[l][c] = input.nextInt();
            }
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }


        maior_num = matriz[0][0];
        menor_num = matriz[0][0];

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {

                //posicao_atual = matriz[l][c];

                if (matriz[l][c] > maior_num) {
                    maior_num = matriz[l][c];
                }

                if (matriz[l][c] < menor_num) {
                    menor_num = matriz[l][c];

                }

                }

            }
         System.out.print("Maior num:" + maior_num);
         System.out.println();
         System.out.print("Menor num:" + menor_num);

        }
    }



