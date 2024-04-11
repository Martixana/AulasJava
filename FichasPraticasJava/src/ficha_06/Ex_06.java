package ficha_06;
import java.util.Scanner;


import static ficha_06.Ex_03.*;
import static ficha_06.Ex_05.*; // Usar o * para importar tudo


public class Ex_06 {

 /*pergunta pelo tamanho do vetor que o utilizador deseja inserir. De seguida permita que
 o utilizador preencha o vetor. Posteriormente, apresente um menu de opções ao utilizador
 que permitam analisar o vetor inserido. Esse menu de opções deve ter o seguinte aspeto:

    7. Maior Elemento
    8. Menor Elemento
    9. Crescente ou Não Crescente
  */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declare variable option
        int opcao;

        //tamanho de vetor
        System.out.print("Vamos criar um vetor. Qual é o tamanho que deve ter?");
        int vetor_size = input.nextInt();

        //Declarar vetor
        int[] vetor = new int[vetor_size];

        //input elements into array
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número no vetor[" + i + "]:");
            vetor[i] = input.nextInt();
        }

        //Display options
        do {

            System.out.print("\n\n***** Análise de um vetor ***** \n");

            System.out.println("1. Maior Elemento");
            System.out.println("2. Menor Elemento");
            System.out.println("3. Crescente ou Não Crescente");
            System.out.println("4. Maior Elemento  - Primo ou Não");
            System.out.println("5. Sair");

            //Capture user option
            System.out.print("\nInsira a opção: ");
            opcao = input.nextInt();


            System.out.println();

            switch (opcao) {
                case 1: //Maior elemento
                    int maiorElemento = maior(vetor);
                    System.out.println("Maior Elemento: " + maiorElemento);
                    break;

                case 2: //Menor elemento
                    System.out.println("Menor Elemento: " + menor(vetor));
                    break;

                case 3: //Crescente ou Nao Crescente
                    if (crescente(vetor)) {
                        System.out.println("Crescente");
                    } else {
                        System.out.println("Não Crescente");
                    }
                    break;

                case 4: //Maior e primo?
                    if (prime(maior(vetor))) {
                        System.out.println("o Maior Elemento é Primo");

                    } else {
                        System.out.println("Maior Elemento não é Primo");
                    }
                    break;

                case 5: //Saída

                    System.out.println("Obrigado e até breve...");
                    break;

                default: //Invalido
                    System.out.println("Opção Inválida!!!");

            }

        }while (opcao !=5);







        }

    }



