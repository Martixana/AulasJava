package ficha_05;

import java.util.Scanner;
public class Ex_09 {
    public static void main (String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[5][5];
        int soma;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("Insira um nùmero inteiro: [" + l + "][" + c + "]:");
                matriz[l][c] = input.nextInt();
            }
        }
        soma = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                soma = soma + matriz[l][c];
            }

        }
        System.out.println(soma);

    }
}
