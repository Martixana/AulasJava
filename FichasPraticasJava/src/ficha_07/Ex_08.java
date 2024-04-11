package ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipos de
produto, produto, quantidade de venda, valor unitário) e calcule o valor total das vendas
 */
public class Ex_08 {

    public static void total_sales (String path) throws FileNotFoundException{

        Scanner reader = new Scanner(new File(path));

      //*****variables in a while loop must always be previously initialized in Java****
        int quantity=0;
        double unit_price=0, total_product=0;
        String product="";


        String linha = reader.nextLine(); //header

        //product lines
        while (reader.hasNextLine()){
            linha = reader.nextLine();

            //split lines based on commas
            String[] itensDaLinha = linha.split(",");

            //print

                quantity = Integer.parseInt(itensDaLinha[2]);
                unit_price = Double.parseDouble(itensDaLinha[3]);

                product = itensDaLinha[1];
                System.out.println( "The total sales for " +product+" is: " +(quantity * unit_price));

                total_product += (quantity * unit_price);

        }


            System.out.println( "The total sales for all products is: " +total_product);
    }

    public static void main(String[] args) throws FileNotFoundException{

        total_sales("ficheiros/exercicio_08.csv");


    }

}
