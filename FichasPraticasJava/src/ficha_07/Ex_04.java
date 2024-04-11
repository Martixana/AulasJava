package ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



// Escreva um programa que leia um ficheiro CSV e imprima o conteúdo na consola
public class Ex_04 {


    //Read file. Print in console
    public static void imprimirFicheiroConsola(String path) throws FileNotFoundException{

        //Instanciar um Scanner para o Ficheiro que foi passado por parâmetro
        Scanner leitorFicheiro = new Scanner(new File(path));

        while (leitorFicheiro.hasNextLine()) {
            String linha = leitorFicheiro.nextLine();
            System.out.println(linha);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        imprimirFicheiroConsola("ficheiros/exercicio_04.csv");


    }

}
