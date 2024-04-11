package ficha_xtra_1;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        //Escreva um programa que imprima os números de 1 a 255, múltiplos de 3

        //Declarar variáveis
        int num = 0;

        for (int i = 0; i < 255; i++) {
            num = num + 1;
            if(num % 3 == 0){
                System.out.println(num);
            }
        }
    }
    }