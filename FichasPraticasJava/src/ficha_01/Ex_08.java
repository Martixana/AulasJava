package ficha_01;

import java.util.Scanner;

//Escreva um programa que calcule a duração (no formato hh:mm:ss) de um album musical con cinco canções. A duração de cada música é lida em minutos e segundos.
public class Ex_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variáveis
        int musica1_min, musica1_segs, musica2_min, musica2_segs, musica3_min, musica3_segs, musica4_min, musica4_segs, musica5_min, musica5_segs;

        //Pedir minutos de música 1
        System.out.println ("Quantos minutos tem a música 1?");
        //guardar valor
        musica1_min = input.nextInt();

        //Pedir segundos de música 1
        System.out.println ("Quantos segundos tem a música 1?");
        //guardar valor
        musica1_segs = input.nextInt();

        //Pedir minutos de música 2
        System.out.println ("Quantos minutos tem a música 2?");
        //guardar valor
        musica2_min= input.nextInt();

        //Pedir segundos de música 2
        System.out.println ("Quantos segundos tem a música 2?");
        //guardar valor
        musica2_segs = input.nextInt();

        //Pedir minutos de música 3
        System.out.println ("Quantos minutos tem a música 3?");
        //guardar valor
         musica3_min = input.nextInt();

        //Pedir segundos de música 3
        System.out.println ("Quantos segundos tem a música 3?");
        //guardar valor
        musica3_segs = input.nextInt();

        //Pedir minutos de música 4
        System.out.println ("Quantos minutos tem a música 4?");
        //guardar valor
        musica4_min = input.nextInt();

        //Pedir segundos de música 4
        System.out.println ("Quantos segundos tem a música 4?");
        //guardar valor
        musica4_segs = input.nextInt();

        //Pedir minutos de música 5
        System.out.println ("Quantos minutos tem a música 5?");
        //guardar valor
        musica5_min = input.nextInt();

        //Pedir segundos de música 5
        System.out.println ("Quantos segundos tem a música 5?");
        //guardar valor
        musica5_segs = input.nextInt();

        //Apresentar os tempos de cada música

        System.out.println ( "Music 1: " + musica1_min + " " + "minutos e " + musica1_segs + " " + "segundos");
        System.out.println ("Music 2: " + musica2_min + " " + "minutos e " + musica2_segs + " " + "segundos" );
        System.out.println ("Music 3: " + musica3_min + " " + "minutos e " + musica2_segs +  " " +"segundos" );
        System.out.println ("Music 4: " + musica4_min + " " + "minutos e " + musica2_segs + " " + "segundos" );
        System.out.println ("Music 5: " + musica5_min + " " + "minutos e " + musica2_segs + " " + "segundos" );


    }
}
