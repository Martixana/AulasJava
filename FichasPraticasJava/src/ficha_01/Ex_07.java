package ficha_01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que requisite ao utilizador o preçp de 3 produtos adquiridos. Apresente o valor a pagar, considerando que deverá ter um desconto de 10% sobre o total dps produtos

        //declaracao variáveis
        int produtoA, produtoB, produtoC;

        //ler valorA
        System.out.println("Insira o preço do produto A");
        produtoA = input.nextInt();

        // Ler valorB
        System.out.println("Insira o preço do produto B");
        produtoB = input.nextInt();

        // Ler valorC
        System.out.println("Insira o preço do produto C");
        produtoC = input.nextInt();

        //Calcular o total
        double total = (produtoA + produtoB + produtoC) - ((produtoA + produtoB + produtoC) * 0.10);


        // Apresentar resultado
        System.out.println("A valor total a pagar é" + " " + "$" + total + ".");
    }
}
