package ficha_05;

import java.util.Scanner;

   public class Ex_07 {
    public static void main (String[] args) {

        //Importar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
       /* int[] vetor = new int[10];
        int maior_par;

        //cycle through to add numbers to array and save
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" Insira um número no vetor [" + i + "]:");
            vetor[i] = input.nextInt();

            System.out.println(vetor[i]);
        }
        //find largest even number
        //while you cycle through this:
        for (int i = 1; i < vetor.length; i++) {
            //find the numbers that are both even and larger than the last number in the cycle
            if (vetor[i] % 2 == 0 && vetor[i] > i - 1) {
                maior_par = vetor[i];
                System.out.println("O maior par é: " + " " + maior_par);
            } else {
                System.out.print("Não existe número par neste array.");
            }

        }

    }

    }*/

  /*package Ficha_05;

import java.util.Scanner;

        public class Ex_07 {
            public static void main(String[] args) {

                // Importar o Scanner
                Scanner input = new Scanner(System.in);*/
// CORRECTED EXERCISE
                // Declarar variáveis
                int[] vetor = new int[10];
                int maiorPar;
                boolean jaTemPar = false;

                System.out.println("**************************");

                // Ler vetor
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print("Insira um número no vetor[" + i + "]: ");
                    vetor[i] = input.nextInt();
                }

                maiorPar = -1;

                // Encontrar o maior par
                for (int i = 0; i < vetor.length; i++) {

                    if (vetor[i] % 2 == 0) {
                    /* Looks like line 73  will always refer to the initial assignment of jaTemPar at the top of the program,
                    every time you cycle through*/
                    /*jaTemPar within the following cycle, and after, is henceforth assigned to true  -
                     which is why the following if statement can never be entered again after the first maiorPar is
                     assigned to a vetor[i] */
                        if (!jaTemPar) {
                            maiorPar = vetor[i];
                            jaTemPar = true;
                        }

                        if (vetor[i] > maiorPar) {
                            maiorPar = vetor[i];
                        }

                    }
                }

                // Apresentar o maior par
                if (jaTemPar) {
                    System.out.println("Maior Par: " + maiorPar);
                } else {
                    System.out.println("Não tem pares!");
                }
            }
        }