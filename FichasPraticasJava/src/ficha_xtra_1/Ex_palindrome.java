package ficha_xtra_1;

public class Ex_palindrome {

    public static void main(String[] args){

        //variables
        int r, temp;
        int sum = 0;
        int n = 454; //to be checked as palindrome

        temp = n;

        while(n > 0){
            r = n % 10; //get remainder
            sum = (sum *10) + r;
            n = n/10;
        }
        if(temp == sum){
            System.out.println("palindrome number");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
