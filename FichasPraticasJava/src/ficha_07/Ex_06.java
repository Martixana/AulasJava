package ficha_07;


/*Escreva um programa que leia um ficheiro de texto contendo nomes
e idades separados por vírgula eimprima o nome da pessoa mais velha na consola
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_06 {

    public static void split_values(String path) throws FileNotFoundException{

        Scanner reader = new Scanner(new File(path));

        int mais_velho = 0;
        String nome = "";

        while (reader.hasNextLine()) {

            //Scan and save each line
            String linha = reader.nextLine(); //iterador

            //split lines based on commas
            String[] itensDaLinha = linha.split(",");

            //print all ages
            for (int i = 0; i < itensDaLinha.length; i++) {
                if(Integer.parseInt(itensDaLinha[1]) > mais_velho){
                    mais_velho = Integer.parseInt(itensDaLinha[1]);
                    nome = itensDaLinha[0];
                }

            }

        }
        System.out.println(nome);
        System.out.println( mais_velho);
        }


       public static void main(String[] args) throws FileNotFoundException{

            split_values("ficheiros/exercicio_06.txt");




        }
    }

