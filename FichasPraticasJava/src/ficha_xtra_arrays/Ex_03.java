package ficha_xtra_arrays;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int wheres_waldo;
        int[] array = new int[10];

        //loop through array
        for(int i = 0; i < array.length; i++){
            System.out.println("Please enter a number in the array["+i+"]: "); //add an integer for each index
            //save numbers to array
            array[i]= input.nextInt();
        }

        System.out.println("Please enter a number: ");
        wheres_waldo = input.nextInt();

        //loop through to compare wheres waldo with numbers in array
        for(int k = 0; k<array.length; k++){
            if(array[k] == wheres_waldo){
                System.out.println("Your number " + wheres_waldo + " is in the array["+k+"]" + array[k] );
            }
            }

            System.out.println("Your number is not found in the array");
        }


    }

