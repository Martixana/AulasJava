package ficha_xtra_1;

public class Ex_shape3 {
    public static void main(String[] args){
        //variable
        int rows = 8;

        for(int i = 0; i <= rows; i++){
            for(int k = 1; k <= rows - i; k++ ){
                System.out.print(" ");//creating the blanks
            }
            for(int m = 0; m <= i; m++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}


