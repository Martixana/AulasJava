package ficha_05;

import java.util.Scanner;
public class Ex_10 {
    public static void main(String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int valor_x, contador=0;
        String pedido = "Insira um número x adicional:";


        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("Insira um número na matriz["+ l + "][" + c + "]:");
                matriz[l][c] = input.nextInt();
            }
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + "\t");

            }
            System.out.println();
        }

       System.out.print(pedido);
        valor_x = input.nextInt();


        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
               if (valor_x == matriz[l][c]){
                       contador++;

                }
               /*else{
                   System.out.print("O seu número não apareceu na matriz");
                }*/

            }
        }
        System.out.print("O seu número X apareceu" + " " +  contador + " " + "vezes na matriz");

    }
}


