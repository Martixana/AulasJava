package ficha_06alt;

import java.util.Scanner;
public class Ex_02 {

    //create method to print out asterisks with argument that will contain number (of asterisks)
    public static void imprimirAsteriscos ( int quantidadeAsteriscos) {

        //knowing the number of asterisks, for each time you loop through the cycle, until you get
        // to the actual number of askterisks used as argument, print one asterisk, as directed in sout
        for (int i = 0; i < quantidadeAsteriscos; i++) {
            //print as opposed to println, will print asterisks all on same line
            System.out.print("*");
        }
    }

        //Ask for user input to know how many asterisks are needed
        public static int lerNumInteiroPositivo() {

            //need scanner for user input
            Scanner input = new Scanner(System.in);

            //variable to hold user number
            int user_num;

            // Do/While:print question as long as num is less than 0 or its
            //modulus isn´t 0
            do {
                System.out.println("Insira um número inteiro positivo: ");
                user_num = input.nextInt();
            } while (user_num < 0 || user_num % 2 != 0);

            return user_num;
        }
                public static void main(String[] args){

               // imprimirAsteriscos(lerNumInteiroPositivo());

               // OR  - create variable to hold num
               int x = lerNumInteiroPositivo();
               imprimirAsteriscos(x);

            }





        }



