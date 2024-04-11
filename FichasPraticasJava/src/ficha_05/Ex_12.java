package ficha_05;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex_12 {
    public static void main(String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        // Escreva um programa que lê 2 arrays de tamanho 10 e gera uma matriz 10x2 com os elementos junto à segunda

        //Declarar variáveis
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matrix = new int[10][2];

        //ask for & save user input for array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira um número no array1[" + i + "]: ");
            array1[i] = input.nextInt();
        }

        //ask for & save user input for array2
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Insira um número no array2[" + i + "]: ");
            array2[i] = input.nextInt();
        }


        // System.out.print(array2);
       /* for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }*/

        //add arrays to matrix
        for (int l = 0; l < matrix.length; l++) {
            matrix[l][0] = array1[l];
            matrix[l][1] = array2[l];
        }
        //print matrix
        for (int l = 0; l < matrix.length; l++) {
            for ( int c = 0; c < matrix[0].length; c++){
                System.out.print(matrix[l][c]+ " " );
        }
                System.out.println( );
    }


    }
}


