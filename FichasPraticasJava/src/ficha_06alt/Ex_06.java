package ficha_06alt;

import java.util.Scanner;

import static ficha_06alt.Ex_03.*;
import static ficha_06alt.Ex_05.*;
public class Ex_06 {


    public static void main(String[] args) {
        /*int[] array = {1,2,3,4,5};

        crescente(array);*/

        //variables
        Scanner input = new Scanner(System.in);
        int size_array, menu_option;


        //Ask for array size
        System.out.println("What size should the array be?");
        size_array = input.nextInt();

        //declare vector
        int[] num_array = new int[size_array];

        //ask user to fill out array
        for (int i = 0; i < size_array; i++) {
            System.out.println("Enter a whole number into the array[" + i + "]");
            num_array[i] = input.nextInt();
        }

        /*now that we have the array filled out, let's ask user what operations
        thye would like to perform with array
         */

        do {
            System.out.println("*** Análise de um vetor *** \n");

            //options
            System.out.println("Please choose an option from the menu: ");
            System.out.println("1. Largest number in array: ");
            System.out.println("2.Smallest number in array: ");
            System.out.println("3.Are numbers in array continuously growing larger?");
            System.out.println("4. Largest Number: prime or not");
            System.out.println("5. Sair");

            //read user option
            System.out.println("\nInsira uma opção: ");
            menu_option = input.nextInt();


            System.out.println();

            //Menu options for operations
            switch (menu_option) {
                case 1: //Largest number
                    int maiorElemento = maior(num_array);
                    System.out.println("Maior elemento: " + maiorElemento + "\n");
                    break;

            case 2: //Smallest number
                System.out.println("Menor elemento: " + menor(num_array) + "\n");
                break;

            case 3: //Crescente ou não
                if (crescente(num_array)) {
                    System.out.println("Crescente" + "\n");
                } else {
                    System.out.println("Não Crescente\n" );
                }
                break;


            case 4: //Largest: prime or not
                if (primo(maior(num_array))) {
                    System.out.println("Maior Elemento é Primo\n");
                } else {
                    System.out.println("Maior Elemento não é primo\n");
                }
                break;


            case 5: //Sair
                System.out.println("*** Obrigada e até a próxima*** ");
                break;

            default:// Inválido
                System.out.println("Opção Inválida\n");
        }

    }while(menu_option !=5);

    }
}












