package ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class Ex_03 {

    //Read file. grab all content
    public static String lerFicheiro(String path) throws FileNotFoundException {

        //Instanciar um Scanner para o Ficheiro que foi passado por parâmetro
        Scanner leitorFicheiro = new Scanner(new File(path));
        String linha,stringTextoCompleto="";

        while (leitorFicheiro.hasNextLine()) {
            linha = leitorFicheiro.nextLine(); //iterador
            System.out.println(linha);
            stringTextoCompleto+=linha+"\n"; //acumulador

        }
        return stringTextoCompleto;

    }





     //Create new file
    public static void criarFicheiroDeTexto(String path, String message) throws FileNotFoundException{


        PrintWriter maquinaEscrever = new PrintWriter(new File(path)); // Criar o PrintWriter "maquinaEscrever"

        maquinaEscrever.println(message); // Escrever a mensagem no ficheiro

        maquinaEscrever.close(); // Gravar e fechar o ficheiro


    }

    //call method
   public static void main (String[] args) throws FileNotFoundException{

        criarFicheiroDeTexto("ficheiros/exercicio_03_novo.txt", lerFicheiro("ficheiros/exercicio_01_Alternativa02.txt" ));

    }





}
