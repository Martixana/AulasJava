package ficha_06;

import java.util.Scanner;



public class Ex_02 {

/*Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro positivo
e cria uma função que imprima numa linha um número de asteriscos igual ao número inserido pelo utilizador
 */

    /*
     * Imprime o número de asteriscos passado por parâmetro, na consola
     * @param quantidadeAsteriscos Quantidade de Asteriscos a serem impressos
     */

    public static void imprimirAsteriscos(int quantidadeAsteriscos) {

        for (int i = 0; i < quantidadeAsteriscos; i++) {
            System.out.print("*");
        }
    }


/*
 * Função que lê números, até que o utilizador introduza um inteiro positivo
 * @return Número Inteiro e Positivo
 */

    public static int lerInteiroPositivo(){

        Scanner input = new Scanner(System.in);

        int num;

        do{
            System.out.print("Insira um número inteiro positivo: ");
            num = input.nextInt();
        }while(num < 0);

        return num;
    }

    public static void main(String[] args) {

        int x = lerInteiroPositivo();
        imprimirAsteriscos(x);
    }

    }



