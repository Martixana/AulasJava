package ficha_xtra_1;


public class Ex_prime {

    // Prime number in Java: Prime number is a number that is greater
    // than 1 and divided by 1 or itself only. In other words, prime numbers can't be
    // divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

    public static boolean primeNum(int num) {

        for (int divider = 2; divider < num; divider++) {
            if (num % divider == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        if (primeNum(9)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

