package ficha_06;

import java.util.Scanner;
public class Ex_07 {

 /*Escreva um programa para desenhar um quadrado no ecrã. Esse quadrado deve ser desenhado por uma função,
 para a qual devem ser passados 3 argumentos: carater a utilizar, número de linhas e número de colunas
  */

public static void letterBox_matrix (int linhas, int colunas, String caracter ){

        for(int i = 1; i <= colunas; i++){

                //fill out the first line
                System.out.print(caracter);

        }
        //empty line
        System.out.println();

        //linhas do meio
        for (int m = 1; m <= linhas -2 ; m++){
            for (int i = 1; i <= colunas; i++){

                //primeiro caracter
                if(i==1){
                    System.out.print(caracter);
                }

                //Espaços
                if(i != 1 && i != colunas) {
                    System.out.print(" ");
                }

                //Último caracter
                if (i == colunas){
                    System.out.print(caracter);
                }
            }
            System.out.println();
        }

        //Ultima linha
        for(int i =1; i <= colunas; i++){
            System.out.print(caracter);
        }

}

public static void main(String[] args) {

    //Scanner
    Scanner input = new Scanner (System.in);

    //Declrar variáveis
    int linhas, colunas;
    String caracter;


    // Ler e guardar dados necessários para criar caixa

    // ler caracter
    System.out.print("Introduza um caracter:");
    caracter = input.next();


    //ler linhas
    System.out.print("Introduza o número de linhas que a matriz vai ter: ");
    linhas = input.nextInt();


    //ler colunas
    System.out.print("Introduza o número de colunas que a matriz vai ter: ");
    colunas = input.nextInt();


    letterBox_matrix ( linhas, colunas, caracter );



    }
}
