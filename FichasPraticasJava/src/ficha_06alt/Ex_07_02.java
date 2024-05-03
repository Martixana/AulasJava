package ficha_06alt;

import java.util.Scanner;
public class Ex_07_02 {

//Try to change following code into a capital letter I shape in the end
        public static void desenharLetra_E(int nLinhas, int nColunas, String caracter) {

            // Primeira Linha
            for (int i = 1; i <= nColunas; i++) {
                System.out.print(caracter);
            }

            System.out.println();



            // Linhas do Meio - part 1
            for (int m = 1; m <= nLinhas; m++) {
                for (int i = 1; i <= (nColunas); i++) {

                    // Primeiro caracter
                    if (i == 1) {
                        System.out.print(caracter);
                    }

                    // Espaços
                    if (i != 1) {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }



            //linha do meio (centro)
                for(int m = 1; m <= nLinhas; m++){
                    for(int i = 1; i <= nColunas; i++){
                            System.out.print(caracter);
                        }
                  }



            // Linhas do Meio - part 2
            for (int m = 1; m <= nLinhas; m++) {
                for (int i = 1; i <= (nColunas); i++) {

                    // Primeiro caracter
                    if (i == 1) {
                        System.out.print(caracter);
                    }

                    // Espaços
                    if (i != 1) {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }


            // Última Linha
            for (int i = 1; i <= nColunas; i++) {
                System.out.print(caracter);
            }


        }

        public static void main(String[] args) {

            // Scanner
            Scanner input = new Scanner(System.in);

            // Declarar variáveis
            int linhas, colunas;
            String caracter;

            // Ler linhas
            System.out.print("Insira as linhas: ");
            linhas = input.nextInt();

            // Ler colunas
            System.out.print("Insira as colunas: ");
            colunas = input.nextInt();

            // Ler caracter
            System.out.print("Insira um caracter: ");
            caracter = input.next();

            desenharLetra_E(linhas, colunas, caracter);

        }
    }

