package ficha_06alt;

public class Ex_03 {

    public static boolean par(int num){


       if(num % 2 == 0){
           return true;
       }else{
           return false;
       }
        }

        public static boolean posOrNeg( int num) {
            if (num >= 0) {
                return true;
            }else {
                return false;
            }
        }


        public static boolean primo( int num){

        for( int divisor = 2; divisor < num; divisor ++){
            if (num % divisor == 0){
                return false;
        }

        }
        //otherwise return true.
            return true;
        }

        public static boolean perfeito (int num) {
            int somaDivisores = 0;

            //loop through and find out which dividers divide num evenly
            // if it does divide evenly, add the divisor to somaDivisor
            for (int divisor = 1; divisor < num; divisor++) {

                if (num % divisor == 0) {
                    somaDivisores += divisor;
                }
            }

            //now we need to compare the somaDivisor with the actual number
            if (num == somaDivisores) {
                return true;
            } else {
                return false;
            }
        }

            public static boolean triangular(int num){

                int somatorio = 0;

                for(int i = 1; somatorio < num; i++){
                    somatorio = somatorio +1;

                    if(somatorio == num){
                        return true;

                }

            }
            return false;
        }

        }





