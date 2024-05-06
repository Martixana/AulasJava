package ficha_06alt;

import java.util.Scanner;
public class Ex_08_03 {

    //function to get rows from user
    public static int getUser_rows(){

        Scanner input = new Scanner(System.in);
        int rows;

       do {
           System.out.println("Please enter a positive integer for the number of rows in the matrix: ");
           rows = input.nextInt();
       }while ( rows < 0);

       return rows;

    }

    //function to get cols from user
    public static int getUser_cols(){

        Scanner input = new Scanner(System.in);
        int cols;

        do {
            System.out.println("Please enter a positive integer for the number of cols in the matrix: ");
            cols = input.nextInt();
        }while ( cols < 0);

        return cols;

    }


}
