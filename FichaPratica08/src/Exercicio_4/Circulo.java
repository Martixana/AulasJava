package Exercicio_4;

public class Circulo {

    //attributes
    public double radius;

    private double pi = 3.14;

    //Constructor
    public Circulo(double radius){
        this.radius = radius;

    }

    //methods

    public double circunferencia(){
        return radius*pi*2;
    }

    public double area(){
        return pi*(radius * radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double novoRadius){
        this.radius = novoRadius;
    }





}
