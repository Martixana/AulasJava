package ficha_06;

public class Ex_03 {

    // even or odd
    public static boolean even(int num) {

        if (num % 2 == 0) { // É par
            return true;
        } else { // É impar
            return false;
        }

    }



     //pos or neg
    public static boolean pos(int num) {

        if (num >= 0) { // Positivo
            return true;
        } else { // Negativo
            return false;
        }
    }

    // prime or not
    public static boolean prime(int num) {

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) { // tem outros divisores senão o 1 e ele mesmo
                return false; //não é primo
            }
        }

        return true;

    }


    //perfect or not
    public static boolean perfect(int num) {

        int somaDivisores = 0;

        for (int divisor = 1; divisor < num; divisor++) {

            if (num % divisor == 0) {
                somaDivisores = somaDivisores + divisor;
            }
        }



        // Expressão mais simples do retorno: return num == somaDivisores;

        if (num == somaDivisores) {
            return true;
        } else {
            return false;
        }

    }

    //triangular or not
    public static boolean triangular(int num) {

        int somatorio = 0;

        for (int i = 1; somatorio <= num; i++) {

            somatorio = somatorio + i;

            if(somatorio == num){
                return true;
            }
        }

        return false;

    }
}










