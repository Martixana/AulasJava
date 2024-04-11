package Exercicio_03;

public class Retangulo {

    //attributes
    private double altura;

    private double largura;


    //constructor
    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    // getter methods
    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    //method to calculate area
    public double area(){
        return altura * largura;
    }

    //method to calculate perimeter
    public double perimetro(){
        return (altura*2) + (largura*2);
    }

    //method to print  largura
    public void printLargura(){
        System.out.println(this.largura);
    }

    // method to print altura
    public void printAltura(){
        System.out.println(this.altura);
    }

    public void setAltura(double novaAltura){
        this.altura = novaAltura;
    }


}
