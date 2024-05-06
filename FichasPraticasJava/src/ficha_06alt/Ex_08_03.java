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
    //using rows/cols as parameters allows us to control their lengths and make sure they are
    // the same by way of the methods for cols/rows
    public static int[][] matrix_A() {
        Scanner input = new Scanner(System.in);
        int rows, cols;
        rows = getUser_rows();
        cols = getUser_cols();
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
    public static int[][] matrix_B() {
        Scanner input = new Scanner(System.in);
        int rows, cols;
        rows = getUser_rows();
        cols = getUser_cols();
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
    public static int[][] matrix_result() {
        //variables to hold previous matrixes
        int[][] a = matrix_A();
        int[][] b = matrix_B();

        //variable -create new matrix to hold result
        int[][] result = new int[getUser_rows()][getUser_cols()]; //pass methods directly as parameters

        for (int k = 0; k < result.length; k++) {
            for (int m = 0; m < result[0].length; m++) {

                result[k][m] = a[k][m] + b[k][m];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print(matrix_result());
    }


}
