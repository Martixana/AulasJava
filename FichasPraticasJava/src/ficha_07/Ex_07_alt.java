package ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Escreva um programa que leia um ficheiro de texto e imprima o número de linhas
e o número de palavras presentes no ficheiro
 */

public class Ex_07_alt {

    public static int contarLinhasFicheiros(String path) throws FileNotFoundException{
        int numeroLinhas = 0;

        Scanner leitura = new Scanner(new File(path));

        while (leitura.hasNextLine()) {
            numeroLinhas++;
            leitura.nextLine();
        }
        return numeroLinhas;
    }

    public static int contarPalavrasFicheiro(String path) throws FileNotFoundException {
        int numeroPalavras = 0;

        Scanner leitura = new Scanner (new File(path));

        while (leitura.hasNext()){
            numeroPalavras++;
            leitura.next();
        }
        return numeroPalavras;
    }

    public static void main(String[] args) throws FileNotFoundException{

        int nPalavras, nLinhas;

        nPalavras =contarPalavrasFicheiro("Ficheiros/exercicio_07.txt");
        nLinhas = contarLinhasFicheiros("Ficheiros/exercicio_07.txt");

        System.out.println("Número de Palavras: " + nPalavras);
        System.out.println("Número de Linhas: " +nLinhas);
    }
}
