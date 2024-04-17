package Exercicio_06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declare instances of object Calculadora
       /* Calculadora calculadoraA = new Calculadora(3, 5);
        Calculadora calculadoraB = new Calculadora(5, 4);
        Calculadora calculadoraC = new Calculadora(5, 4);
        Calculadora calculadoraD = new Calculadora(20, 4);

        //Apply methods to each instance of object
        System.out.println(calculadoraC.soma());

        System.out.println(calculadoraD.divisao());

        System.out.println(calculadoraA.subtracao());

        System.out.println(calculadoraB.multiplicacao());

    // More complex operation  - one object instance performing two diff methods with results that will be added
        System.out.println(calculadoraB.multiplicacao() + calculadoraB.soma());
    // two diff objects performing two diff methods interacting (both with same data type - double)
        System.out.println(calculadoraB.multiplicacao() + calculadoraA.soma());
    //multiplication of two diff objects
        System.out.println(calculadoraD.subtracao() - calculadoraA.multiplicacao());*/

//-----------------------------------------------------------------------------------------------

        //Instantiate object Calculadora
       /* Calculadora calculadora1 = new Calculadora();

        //input
        int x = 6;
        int y = 3;

        int resolucao[] = calculadora1.performBasicArithmetic(x, y);

        System.out.println(resolucao[1]);
        System.out.println(resolucao[0]);
        System.out.println(resolucao[2]);
        System.out.println(resolucao[3]);*/
1
    Calculadora calculadoraA = new Calculadora();
    Scanner input  = new Scanner(System.in);

    double numero1, numero2;

    String operacao;

 //for an infinite cycle
    while(true){

        System.out.print("Insira um número: ");
        numero1 = input.nextDouble();

        System.out.print("Operação Aritmética (+ - * /): ");
        operacao = input.next();

        System.out.println("Insira outro número: ");
        numero2 = input.nextDouble();

        System.out.print("Resultado: ");


        switch (operacao) {

            case "+":
                System.out.println(calculadoraA.soma(numero1, numero2));
                break;

            case "-":
                System.out.println(calculadoraA.subtracao(numero1, numero2));
                break;

            case "*":
                System.out.println(calculadoraA.multiplicacao(numero1,numero2));
                break;

            case "/":
                System.out.println(calculadoraA.divisao(numero1,numero2));
                break;
        }

        System.out.println();
    }



    }
    }

