package ficha_06alt;

import java.util.Scanner;

public class Ex_08 {

    public static void somarMatrizes(int[][] matrixA, int[][] matrixB){

        int somatorio = 0;

        //loop through matrixA and add elements
        for(int i = 0; i < matrixA.length; i++){
            for(int k = 0; k < matrixA[0].length; k++){

                somatorio += i;
            }

        }
        //loop through matrixB and add elements to somatorio, too
        for(int l = 0; l < matrixB.length; l++){
            for(int m = 0; m < matrixB[0].length; m++){
                somatorio += l;
            }

        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matrixA = new int[3][3];
        int[][] matrixB = new int[3][3];

        //loop through matrixA and fill each index
        for(int i = 0; i < matrixA.length; i++){
            for(int k = 0; k < matrixA[0].length; k++){

                System.out.println("Please enter a whole number for Matrix A ["+i+"]: ");
                matrixA[i][k]= input.nextInt();
            }

        }

        //loop through matrixB and fill each index
        for(int l = 0; l < matrixB.length; l++){
            for(int m = 0; m < matrixA[0].length; m++){

                System.out.println("Please enter a whole number for Matrix B ["+l+"]: ");
                matrixB[l][m]= input.nextInt();
            }

        }




    }
}
