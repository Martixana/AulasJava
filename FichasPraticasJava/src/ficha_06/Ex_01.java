package ficha_06;

import java.util.Scanner;
public class Ex_01 {



    /* Implemente uma função void fazerBarulho() que receba um animal(String) como argumento. De seguida,
    de acordo com o animal deve fazer o barulho carecterístico (cao  -"au au", gato  - "miau", peixe - "glub glub",
    vaca - "muu", porco - "oinc oinc")
     */

    public static void fazerBarulho(String animal) {
        //Passamos o que recebemos por parametro para maiúsculas
        animal = animal.toUpperCase();

        switch (animal) {
            case "CAO":
                System.out.println("Au au au!");
                break;

            case "GATO":
                System.out.println("Miau!");
                break;

            case "PEIXE":
                System.out.println("Glub Glub!");
                break;

            case "VACA":
                System.out.println("Muuuu!");
                break;

            case "PORCO":
                System.out.println("Oinc! Oinc!");
                break;

            case "SAIR":
                System.out.println("Chau, boa viagem!");
                break;

            default:
                System.out.print("Opção inválida! Tente novamente");
        }

    }
    //**** Scanner added. Can I put both functions into one, so that the question of the option continues on loop? *****
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        //declarar variaveis
        String resposta;

        System.out.println("\n*** Bem-vindo ao programa dos barulhos ***");
        do {
            System.out.println("Escolha um animal entre os seguintes: gato, cao, peixe, vaca, porco:");
            resposta = input.next();

            fazerBarulho(resposta);
        }while( !resposta .equals("SAIR"));


    }
}

