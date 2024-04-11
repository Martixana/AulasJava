package ficha_01;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

       // Importar Scanner
        Scanner input = new Scanner(System.in);

        //declaracao variáveis
        int  num1, num2;

        // Ler num1
        System.out.println("Bom dia! Insira um número inteiro");
        num1 = input.nextInt();

        // Ler num2
        System.out.println("Insira outro número inteiro");
        num2 = input.nextInt();

        //Somar num1 com num2
        var soma = num1 + num2;

        // Apresentar resultado
        System.out.println("A sua soma dá" + " " + soma);





    }
}
