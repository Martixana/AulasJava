package ficha_05;

import java.util.Scanner;
public class ex_06 {
    public static void main (String[] args){

     //Importar o Scanner
     Scanner input = new Scanner (System.in);

     // Declarar variáveis
        double [] vetor = new double [10];
        boolean crescente = true;

      //Ler o vetor
        for( int i = 0; i < vetor.length; i++){
            System.out.print ("Insira um número no vetor["+i+"]: ");
      //Guardar i
            vetor[i] = input.nextDouble();
        }
        for(int i = 1; i<vetor.length; i++){
            if(vetor[i] <= vetor[i-1]){
                //o vetor deixou de ser crescente
                crescente = false;
            }
        }
        if(crescente) {
            System.out.println("O vetor é crescente");
        }else{
            System.out.println("O vetor não é crescente");
        }
    }
}
