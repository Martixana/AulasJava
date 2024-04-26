package ficha_06alt;

public class Ex_05 {


    //find largest in in array
    public static int maior(int[] vetor) {

        int maior = 0;
        //loop through array to find the largest number
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    //find smallest int in array
    public static int menor(int[] vetor) {

        int menor = vetor[0];
        //loop through array to find the largest number
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    //in ascending order?
    public static boolean crescente(int[] vetor) {

        //loop through array to find out if in ascending order, start at index one to compare to index 0
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i -1]) {
                    return false;
                }

            }
                return true;
        }
        //if done like this (below), you can't compare the last number in vector (i) with anything.
        /*for (int i = 0; i < vetor.length; i++) {
            for (int k = 1; k < vetor.length; k++) {
                if (vetor[k] > vetor[i]) {
                    return true;
                }

            }

        }
        return false;

    }*/
}








