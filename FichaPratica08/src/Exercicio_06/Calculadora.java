package Exercicio_06;

public class Calculadora {

    //Constructor
    public Calculadora() {
    }

    //Methods
        public double soma(double num1, double num2){
            return num1 + num2;
        }

        public double subtracao(double num1, double num2){
            return num1-num2;
        }

        public double multiplicacao(double num1, double num2){
            return  num1 * num2;
        }

        public double divisao(double num1, double num2){
            return  num1 / num2;
        }
    }

    //attributes

   /* public double x;
    public double y;

    //Constructor
    public Calculadora(double x, double y){
        this.x = x;
        this.y = y;
    }*/

    //Array data type for Method. Since it´s a data type. Just like a double or String
    /*public int[] performBasicArithmetic(int x, int y ){
        //variables to use in array later
        int soma = x+y;
        int subtracao = x-y;
        int multiplicacao = x*y;
        int divisao = x/y;

        //creating actual array
        int resolucao[] = new int[4];
        resolucao[0]=soma;
        resolucao[1]=subtracao;
        resolucao[2]=multiplicacao;
        resolucao[3]=divisao;

        return resolucao;
    }*/



