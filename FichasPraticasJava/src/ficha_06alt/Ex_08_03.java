package ficha_06alt;

import java.util.Scanner;
public class Ex_08_03 {

    //function to get rows from user
    public static int getUser_rows() {

        Scanner input = new Scanner(System.in);
        int rows;

        do {
            System.out.println("Please enter a positive integer for the number of rows in the matrix: ");
            rows = input.nextInt();
        } while (rows <= 0);

        return rows;

    }

    //function to get cols from user
    public static int getUser_cols() {

        Scanner input = new Scanner(System.in);
        int cols;

        do {
            System.out.println("Please enter a positive integer for the number of columns in the matrix: ");
            cols = input.nextInt();
        } while (cols <=0);

        return cols;

    }

    //method to initialize matrix A
    public static int[][] matrix_A(int rows, int cols) {
        Scanner input = new Scanner(System.in);
        int[][] matrix_A = new int[rows][cols];

        for (int k = 0; k < matrix_A.length; k++) {
            for (int m = 0; m < matrix_A[0].length; m++) {
                System.out.println("Please enter an integer into the matrix[" + k + "][" + m + "]: ");
                matrix_A[k][m] = input.nextInt();
            }
            System.out.println();
        }
        return matrix_A;
    }

    //method to initialize matrix B
    public static int[][] matrix_B(int rows, int cols) {
        Scanner input = new Scanner(System.in);
        int[][] matrix_B = new int[rows][cols];

        for (int k = 0; k < matrix_B.length; k++) {
            for (int m = 0; m < matrix_B[0].length; m++) {
                System.out.println("Please enter an integer into the second matrix[" + k + "][" + m + "]:");
                matrix_B[k][m] = input.nextInt();
            }
            System.out.println();
        }
        return matrix_B;
    }

    //method to perform matrix addition
    public static int[][] matrix_result(int[][] a, int [][]b) {
       int rows = a.length;
       int cols = a[0].length;
       //variable -create new matrix to hold result
        int[][] result = new int[rows][cols];

        for (int k = 0; k < rows; k++) {
            for (int m = 0; m < cols; m++) {
                result[k][m] = a[k][m] + b[k][m];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int rows = getUser_rows();
        int cols = getUser_cols();
        int[][] a = matrix_A(rows, cols);
        int[][] b = matrix_B(rows, cols);
        int[][] result = matrix_result(a, b);
        System.out.println("Resulting Matrix: ");
        for(int[] row : result) {
            for (int cell : row){
                System.out.print( cell + " ");
            }
            System.out.println();
        }
    }
    
}
