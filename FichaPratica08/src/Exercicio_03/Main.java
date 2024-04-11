package Exercicio_03;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Retangulo retanguloA = new Retangulo(33, 12);
        Retangulo retanguloB = new Retangulo(4, 5);
        Retangulo retanguloC = new Retangulo(339, 120);

        //Good for quick checks of values
        retanguloA.printLargura();
        retanguloC.printAltura();

        /*Writing out in a sentence seems to be the only reason to create getters here.
        Otherwise, it seems we can use largura and altura in other methods of the same
        class (retangulo doc) without needing getters (not a privacy issue bc in the same
        class.
         */
        System.out.println("Este retângulo tem uma largura de " + retanguloB.getLargura() + " metros.");
        System.out.println("Este retângulo tem uma altura de " + retanguloA.getAltura() + " metros.");

        //print area with area method
        System.out.println( "O retângulo C tem uma área de " + retanguloC.area() + " metros quadrados");
        //print area with area method
        System.out.println( "O retângulo B tem um perímetro de " + retanguloB.perimetro() + " metros quadrados");

        //reset altura
        retanguloC.setAltura(100);
        //new altura confirmed
        System.out.println("Este retângulo tem uma altura de " + retanguloC.getAltura() + " metros.");
        //new area based on new altura
        System.out.println( "O retângulo C tem uma área de " + retanguloC.area() + " metros quadrados");





    }
}
