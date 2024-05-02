package ficha_06alt;

import java.util.Scanner;
public class Ex_07 {


    public static void drawSquare(int rows, int columns, String letter) {

        //first line
        for (int m = 1; m <= columns; m++) {
                System.out.print(letter);
            }

        //empty line
        System.out.println();

        //middle lines  - need to write out as if line in matrix
        for(int k = 1; k <= rows -2; k++){
            for(int j = 1; j <= columns; j++) {
                //first character
                if (j == 1) {
                    System.out.print(letter); // add the \n to letter to make the side letters zigzag
                }
                //middle characters
                if (j != 1 && j != columns) {
                    System.out.print(" ");
                }

                //last character
                if (j == columns) {
                    System.out.print(letter + "\n");
                }
        }
        //empty line
       //System.out.println();
    }
                //last line
                for(int i = 1; i <= columns; i++){
                    System.out.print(letter);
                }
    }


        //main method
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //variables
         int rows, columns;
         String letter;

         //get number of rows from user
         System.out.println("Please input a number for rows: ");
         rows = input.nextInt();

         //get number of columns from user
         System.out.println("Please input a number for columns: ");
         columns = input.nextInt();

         //get letter from user
         System.out.println("Please choose a letter from a to z:");
         letter = input.next();

         drawSquare(rows, columns, letter);

        }
    }


