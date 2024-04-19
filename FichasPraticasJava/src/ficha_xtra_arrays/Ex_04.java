package ficha_xtra_arrays;

import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int searchValue;

        //add numbers to array
        for(int i = 0; i < array.length; i ++){
            System.out.println("Please enter a whole number in the array["+i+"]:");
            array[i] = input.nextInt();
        }
         //get search number from user
        System.out.println("Please enter a number to search the array for: ");
        searchValue = input.nextInt();

        //boolean found = false;
        
        for(int i = 0; i< array.length; i++){
            if(array[i] == searchValue){
                System.out.println("Your number was found in the array["+i+"]:" + array[i]);


            }
        }





    }
}
