package ficha_05_redo;

import java.util.Scanner;
public class Ex_02 {

    public static void imprimirAstericos (int quantidadeAsteriscos){

        for(int i = 0; i < quantidadeAsteriscos; i++){
            System.out.println("*");
        }
    }

    public static int lerInteiroPositivo() {

        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.println("Insira um número inteiro positivo; ");
            num = input.nextInt();
        } while (num < 0 || num % 2 != 0);
        return num;
    }

    public static void main(String[] args){

        int x;

        x = lerInteiroPositivo();
        imprimirAstericos(x);

    }
}


