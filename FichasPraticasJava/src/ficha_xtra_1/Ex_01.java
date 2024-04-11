package ficha_xtra_1;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        //Escreva um programa que imprima os números de 1 a 500 usando o ciclo for

        //Declarar variavéis
        int num = 0;

        for (int i = 0; i < 500; i++) {
            num = num +1;
            System.out.println(num);
        }

    }
}
