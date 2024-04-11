package ficha_01;

import java.util.Scanner;
public class Ex_03 {
    // Escreva programa que calcule área  e perímetro de uma circumferência . Nota perímetro = 2* 3.14 *r e área = 3.14*r*r
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declaracao variáveis
        double  pi = 3.1415;
        int raio;


        System.out.println("Bom dia! Insira um número inteiro para o raio");
        raio = input.nextInt();

        //Calcular area
        double peri = 2 * pi * raio;
        double area = raio * raio * pi;

        // Apresentar resultado
        System.out.println("A área da sua circumferência é de" + " " + area + "e o perímetro é de " + peri );
    }


}
