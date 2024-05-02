package ficha_06alt;

import java.util.Scanner;
public class Ex_07 {

    //function to print out first line
    public static String drawSquare(int rows, int columns, String letter) {

        //first line
        for (int m = 1; m <= columns; m++) {
            for(int i = 1; i <= rows ; i++) {
                System.out.print(letter);
            }
        }
        return letter;
    }


        //get number of columns from user
        public static int numColumns(){
            Scanner input = new Scanner(System.in);
            int cols;

            System.out.println("Please enter the number of columns:");
            cols = input.nextInt();
            return cols;
        }



        //get number of rows from User
        public static int numRows(){
            Scanner input = new Scanner(System.in);
            int rows;

            System.out.println("Please enter the number of rows:");
            rows = input.nextInt();
            return rows;
        }



        //get letters from user
        public static String userLetter(){
            Scanner input = new Scanner(System.in);
            String letter;

            System.out.println("Please enter a letter:");
            letter = input.next();
            return letter;
        }


        //main method
        public static void main(String[] args){

            drawSquare(numRows(), numColumns(), userLetter());

        }


    }


