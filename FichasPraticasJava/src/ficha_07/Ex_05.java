package ficha_07;

/*Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço
e calcule a soma desses números
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_05 {

    //read file and sum of numbers in ´total'
    public static void ler_e_soma(String path) throws FileNotFoundException {
        Scanner numberReader = new Scanner(new File(path));

        //String linha = numberReader.nextLine();

        int num, total = 0;

       while (numberReader.hasNextLine()) {

            num = numberReader.nextInt();
            total += num;
        }

        System.out.println(total);
        numberReader.close();


    }


    //invoke method
    public static void main(String[] args) throws FileNotFoundException {

        ler_e_soma("ficheiros/exercicio_05_31.txt");

        ler_e_soma("ficheiros/exercicio_05_1999.txt");


    }

}


