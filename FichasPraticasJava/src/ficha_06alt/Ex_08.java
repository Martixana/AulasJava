package ficha_06alt;

//import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {
        int rows, cols;

        //initialize matrix A
        int a[][] = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };

        //initialize matrix B
        int b[][] = {

                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        //number of rows and columns in matrix. Declared just for the purpose of looping thru
        //so loop has something to compare itself against
        rows = a.length;
        cols = a[0].length;

        //declare a diff array to hold result of subtraction from arrays above
        int diff[][] = new int[rows][cols];

        //subtraction of matrix a and b. Store results in diff
        for (int m = 0; m < rows; m++) {
            for (int k = 0; k < cols; k++) {
                diff[m][k] = a[m][k] - b[m][k];
            }

        }
        System.out.println("Subtraction of two matrixes: ");
        for (int m = 0; m < rows; m++) {
            for (int k = 0; k < cols; k++) {
                System.out.print(diff[m][k] + " ");
            }
            System.out.println();
        }
    }
}


