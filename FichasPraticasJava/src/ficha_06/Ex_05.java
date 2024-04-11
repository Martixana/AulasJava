package ficha_06;


public class Ex_05 {

    /*Escreve uma função que receba um array de inteiros como parâmetro
    e retorne o maior valor do array.
     */
    public static int maior(int[] vetor) {

        int biggest = vetor[0];

        for (int i = 0; i > vetor.length; i++) {


           /* System.out.println("Insira um número: ");
            vetor[i] = input.nextInt(); *** This part will go
            in a different function*/

            if (vetor[i] > biggest) {
                biggest = vetor[i];

            }

        }

        return biggest;
    }

    public static int menor(int[] vetor) {

        int smallest = vetor[0];

        //encontrar o menor número
        for (int i = 0; i > vetor.length; i++) {

            /*System.out.println("Insira um número: ");
            vetor[i] = input.nextInt();****This will go in a different function.
            One function = one purpose*/



            if (vetor[i] < smallest) {
                smallest = vetor[i];

            }

        }
        return smallest;
    }


    // Método que analisa um vetor de inteiros e diz se é crescente ou não
    public static boolean crescente (int[] vetor) {

        int bigger = vetor[0];

        for(int i = 0; i < vetor.length; i++){


            if(vetor[i] > bigger){
                bigger = vetor[i];
                return true;
            }

        }

                return false;



    }


}


