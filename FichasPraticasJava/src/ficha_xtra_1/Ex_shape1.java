package ficha_xtra_1;

public class Ex_shape1 {

    public static void main(String[] args){
        //variable
        int rows = 8;

        for(int i = 0; i < rows; i++){
            for(int k = 0; k <= i; k++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
