package ficha_06alt;

import java.util.Scanner;

public class Ex_08_02 {

    //Try same exercise as previous but addition instead of subtraction
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int rows, cols;

            //get size of matrix from user
            //added do/while to protect program from neg number inputs
            do {
                System.out.println("Please enter a positive integer for the number of rows for each matrix: ");
                rows = input.nextInt();
            }while(rows < 0);

            do {
                System.out.println("Please enter a positive integer for the number of columns for each matrix: ");
                cols = input.nextInt();
            }while(cols < 0);

            //declare matrixes a and b
            int a[][] = new int[rows][cols];
            int b[][] = new int[rows][cols];


            //initialize matrix A
            for (int m = 0; m < a.length; m++) {
                for (int k = 0; k < a[0].length; k++) {
                    System.out.println("Please enter a positive integer in matrix A:");
                    a[m][k] = input.nextInt();
                }

            }

            //initialize matrix B
            for (int m = 0; m < b.length; m++) {
                for (int k = 0; k < b[0].length; k++) {
                    System.out.println("Please enter a positive integer in matrix B: ");
                    b[m][k] = input.nextInt(); // the initial def of rows and cols still works here because the number of rows and cols in A is same as be. For purpose of counting in loop,it works
                }

            }


            //declare a diff array to hold result of subtraction from arrays above. Hard coding the rows/cols length bc it has to be same as matrixes above, anyway
            int add[][] = new int[rows][cols];

            //number of rows and columns in matrix. Declared just for the purpose of looping thru
            //so loop has something to compare itself against (see previous exercise, original version. This works whether it is b.length or
            // a.length. It's just a way to later have something for your for loops to count against
            //since we don't have a "generic" matrix. An actual matrix needs to be used. Which isn't
            //a problem since these operations can only be performed with two matrixes of the same size.

            //addition of matrix a and b. Store results in diff
            for (int m = 0; m < a.length; m++) { //notice, could use b.length here to the same end
                for (int k = 0; k < a[0].length; k++) {
                    add[m][k] = a[m][k] + b[m][k];
                }

            }
            //print out new matrix
            System.out.println("Addition of two matrixes: ");
            for (int m = 0; m < a.length; m++) { //notice, could use b.length here but they are the same so it doesn't matter which one is used.
                for (int k = 0; k < a[0].length; k++) {
                    System.out.print(add[m][k] + " ");
                }
                System.out.println();
            }
        }
    }




