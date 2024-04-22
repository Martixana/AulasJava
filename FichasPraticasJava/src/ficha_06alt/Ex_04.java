package ficha_06alt;

import java.util.Scanner;
import static ficha_06alt.Ex_03.*;

import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, opcao;

        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        do{

            //Apresentar as opções
            System.out.println("\n***** Análise de um número: " +numero+ "*********\n" );
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou nao Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("7. Sair");

            //get user´s choice
            System.out.println("\nInsira uma opção: ");
            opcao = input.nextInt();

            System.out.println();

        switch (opcao) {
            case 1: //Par ou Impar

                if (par(numero)) {
                    System.out.println("Par");
                } else {
                    System.out.println("Impar");
                }
                break;

            case 2: //Positivo ou negativo

                if (posOrNeg(numero)) {
                    System.out.println("Positivo");
                } else {
                    System.out.println("negativo");
                }
                break;

            case 3: //primo ou não

                if (primo(numero)) {
                    System.out.println("Primo");
                } else {
                    System.out.println("Não é primo");
                }
                break;

            case 4: //perfeito

                if (perfeito(numero)) {
                    System.out.println("perfeito");
                }else {
                    System.out.println("Não é perfeito");
                }
                break;

            case 5: //triangular

                if(triangular(numero)) {
                    System.out.println("triangular");
                } else {
                    System.out.println("Não é triangular");
                }
                break;

            case 6: //trocar de número

                //ler número
                System.out.println("Insira um novo número");
                numero = input.nextInt();

                break;

            case 7: //Sair


                System.out.println("Até logo");

                break;


            default:
            System.out.println("Opção inválida");

    }

    } while (opcao !=7);




        }

        }

