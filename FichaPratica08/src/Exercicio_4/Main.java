package Exercicio_4;

public class Main {
    public static void main(String[] args) {

        //Instantiate a circle
        Circulo circuloAzul = new Circulo(5);
        Circulo circuloRoxo = new Circulo(7);

        System.out.println(circuloRoxo.area());

        System.out.println(circuloRoxo.circunferencia());

        System.out.println("O meu círculo roxo tem radius de " + circuloRoxo.getRadius() + " e tem uma circunferência de " + circuloRoxo.circunferencia() + " centímetros.");

        System.out.println("O meu círculo roxo tem radius de " + circuloRoxo.getRadius() + " e tem uma área de " + circuloRoxo.area() + " centímetros.");

        System.out.println("O meu círculo azul tem radius de " + circuloAzul.getRadius() + " e tem uma circunferência de " + circuloAzul.circunferencia() + " centímetros.");

        System.out.println("O meu círculo azul tem radius de " + circuloAzul.getRadius() + " e tem uma área de " + circuloAzul.area() + " centímetros.");

    }


}
