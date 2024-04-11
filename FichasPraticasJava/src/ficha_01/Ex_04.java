
package ficha_01;

import java.util.Scanner;
public class Ex_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    //Calcule e apresente a area e o perímetro de um retângulo. As dimensões devem ser requesitadas ao utilizador
    //declaracao variáveis
    int  ladoA, ladoB;

    //ler ladoA
     System.out.println("Bom dia! Insira um número inteiro");
        ladoA= input.nextInt();

    // Ler num2
        System.out.println("Insira outro número inteiro");
        ladoB = input.nextInt();

    //Calcular a área
    double multi_sides = (ladoA * ladoB);
    double area = Math.pow(multi_sides, 2);

    //Calcular o perímetro
        double peri = (ladoA *2)+(ladoB *2);

        // Apresentar resultado
        System.out.println("A área do seu retângulo é de" + " " + area +  "metros quadrados " + "e o perímetro é de " + peri );

    }
}
