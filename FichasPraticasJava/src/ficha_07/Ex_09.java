package ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Escreva um ficheiro que leia um programa CSV contendo
informações de músicas (nome, artista, género, duração) para uma matriz
    a - crie um menu com opções, sendo que cada uma delas albergerá as seguintes alíneas:
    b - pesquisar por música de um determinado género
    c - pesquisar músicas de um determinado artista
    d - pesquisar música com maior duração
    e - pesquisar músicas com duração acima de um valor especificado
    f - número de músicas no ficheiro
 */
public class Ex_09 {

    // a - crie um menu com opções, sendo que cada uma delas albergerá as seguintes alíneas:
    // b - pesquisar por música de um determinado género
    public static void genre (String path) throws FileNotFoundException {

        Scanner scanner1 = new Scanner(new File(path));

        //declare variables
        String musicGenre;
       // String[] genres_f_allSongs = new String[musicGenre];

        //header
        String linha = scanner1.nextLine();

        //song lines
        while (scanner1.hasNextLine()) {
            linha = scanner1.nextLine();

            //split lines based on commas
            String[] itensDaLinha = linha.split(",");

            musicGenre = itensDaLinha[2];

           // int vetor_size = input.nextInt();

            //Declarar vetor
           // int[] vetor = new int[vetor_size];






        }

    }







    // c - pesquisar músicas de um determinado artista

    public static void musicas_artista (String path) throws FileNotFoundException {

        Scanner scanner1 = new Scanner(new File(path));

        //declare variables

        //header
        String linha = scanner1.nextLine();


    }



    // d - pesquisar música com maior duração
    // e - pesquisar músicas com duração acima de um valor especificado
    //f - count number of songs in file
    public static void total_songs(String path) throws FileNotFoundException {

        Scanner reader = new Scanner(new File(path));

        //declare variables
        int num_songs = 0;

        //header
        String linha = reader.nextLine();

        while (reader.hasNextLine()) {
            linha = reader.nextLine();
            num_songs++;

        }
        System.out.println(num_songs);

    }

    public static void main(String[] args) throws FileNotFoundException {

        total_songs("ficheiros/exercicio_09.csv");

    }
}