package ficha_06;

import static ficha_06.Ex_03.*; // Usar o * para importar tudo

import java.util.Scanner;
public class Ex_04 {

    // main function for return values -- exercise 4 -- análise de números
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int userNumber, opcao;

        // Choose number
        System.out.print(" Insira um número: \n");
        userNumber = input.nextInt();

        do {

            //Apresentar as opcoes
            System.out.println("\n Análise do seu número: " + " " + userNumber);
            System.out.println("1.Par ou Impar");
            System.out.println("2.Positivo ou Negativo");
            System.out.println("3.Primo ou Não Primo");
            System.out.println("4.Perfeito ou Não Perfeito");
            System.out.println("5.Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("7. Sair");

            //ler opcao
            System.out.print("Insira uma opção: \n");
            opcao = input.nextInt();

            //Apresentar as opções
            switch (opcao) {
                case 1:
                    if (even(userNumber)) {
                        System.out.print("Par");
                    } else {
                        System.out.print("impar");
                    }
                    break;

                case 2:
                    if (pos(userNumber)) {
                        System.out.print("Positivo");
                    } else {
                        System.out.print("Negativo");
                    }
                    break;

                case 3:
                    if (prime(userNumber)) {
                        System.out.print("Primo");
                    } else {
                        System.out.print("Não Primo");
                    }
                    break;

                case 4:
                    if (perfect(userNumber)) {
                        System.out.print("Perfeito");
                    } else {
                        System.out.print("Não Perfeito");
                    }
                    break;

                case 5:
                    if (triangular(userNumber)) {
                        System.out.println("Triangular");
                    } else {
                        System.out.println("Não Triangular");
                    }
                    break;

                case 6:
                    System.out.print("Insira um novo número: ");
                    userNumber = input.nextInt();

                    break;

                case 7: //Sair
                    System.out.println("Chau!");
                    break;

                default:
                    System.out.println("Opção Inválida");

            }

        } while (opcao != 7);

    }
}





