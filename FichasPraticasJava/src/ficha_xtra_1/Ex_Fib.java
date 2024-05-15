package ficha_xtra_1;

public class Ex_Fib {

    //In fibonacci series, next number is the sum of previous two numbers for
    // example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
    public static void main(String[] args){
       int n1 = 0, n2 = 1, n3, i, count = 10;

       //just print out 0 and 1
        System.out.println(" " + n1);
        System.out.println(" " + n2);

        //for loop to use after printing out 0 and 1
        for(i = 2; i < count; i++){
            n3 = n1 + n2;
            System.out.println(" " + n3);

            //need to update these variables with each loop in order to
            //keep climbing in numbers - bc Fibonacci is always product of two previous numbers
            n1 = n2;
            n2 = n3;

        }

        }
    }

