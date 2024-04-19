package ficha_xtra_arrays;

import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[12];

        //iterate through and add user input
        for(int k = 0; k < array.length; k++){
            System.out.println("Please enter a number in the array["+k+"]: ");
            array[k] = input. nextInt();
        }

        //find duplicates - nested for loops, compare the two diff iterators
        for(int i = 0; i< array.length; i++){
            for( int k = i +1; k < array.length; k++){
                if (array[i] == array[k]){

                    System.out.println("The duplicated number in your array is " + array[k]);

                }
            }
        }


    }
}
