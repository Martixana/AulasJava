package ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Escreva um programa que leia um ficheiro de texto e imprima o número de linhas
e o número de palavras presentes no ficheiro
 */
public class Ex_07 {

    public static void lines_and_words (String path) throws FileNotFoundException{

        Scanner reader = new Scanner(new File(path));

        int count_lines = 0, count_words = 0;

        //count lines in file
        while (reader.hasNextLine()) {

            //Scan and save each line
            String linha = reader.nextLine(); //iterador

            count_lines++;

            //split lines based on spaces
            String[] itensDaLinha = linha.split(" ");


            //count words in each line
            for (int i = 0; i < itensDaLinha.length; i++) {

                    count_words++;
                }

            }
        System.out.println(count_lines);
        System.out.println( count_words);
        }






    public static void main(String[] args) throws FileNotFoundException{

        lines_and_words("ficheiros/exercicio_07.txt");


    }
}
