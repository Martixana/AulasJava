package ficha_xtra_arrays;

import java.util.Scanner;
public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user_array_length;

        System.out.println("Please give me a whole number to describe the length of the array: ");
        user_array_length = input.nextInt();

        int[] array = new int[user_array_length];

        //loop through, ask user for input at each index, save to array
        for(int i = 0; i <array.length; i ++){
            System.out.println("Please enter an number for this position of the array["+i+"]: ");
            array[i] = input.nextInt();
        }
        //print out each index in the array in the order it was inserted
        for(int k = 0; k < array.length; k++){

            System.out.println("Array["+k+"]: " + array[k]);

        }

    }
}
