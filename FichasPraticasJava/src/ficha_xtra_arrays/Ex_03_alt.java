package ficha_xtra_arrays;

import java.util.Scanner;
public class Ex_03_alt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declare array
        int[] array = new int[10];
        //variable
        int wheresWaldo;

        //loop through the array and add user input
        for(int i = 0; i < array.length; i++){
            System.out.println("Insert a whole number into the array["+i+"]:");
            array[i] = input.nextInt();
        }

        //ask user for search number
        System.out.println("Please insert another number: ");
        wheresWaldo = input.nextInt();

        //search for number in array: bool starts out as false
        boolean encontrado = false;

        //is the search number in array? If so, bool turns true
        for(int i = 0; i < array.length; i ++){
            if(array[i] == wheresWaldo){
                encontrado = true;
            }
        }
        //this is where you can do an if/else statement
        if(encontrado){
            System.out.println("O seu número: " + wheresWaldo + "foi encontrado no array.");
        }else{
            System.out.println("O seu número: " + wheresWaldo + " não foi encontrado no array.");
        }
    }
}
