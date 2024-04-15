package Exercicio_05;


public class Main {

    public static void main(String[] args) {

        //Instantiate a car
        Carro azul = new Carro("ferrari", "3X45", 1968);
        Carro roxo = new Carro("Nissan", "X19", 1978);


        //Calling the methods
        System.out.println(azul.ligar());
        System.out.println(azul.getMarca());
        System.out.println(roxo.getModelo());
        System.out.println("O ano de fabrico do meu " + azul.getMarca() + " " + azul.getModelo() + ", é de " + azul.getAno_fabrico() + ".");
        System.out.println("O ano de fabrico do meu " + roxo.getMarca() + " " + roxo.getModelo() + ", é de " + roxo.getAno_fabrico() + ".");

        roxo.setAno_fabrico(1979);

        System.out.println("O ano de fabrico do meu " + roxo.getMarca() + " " + roxo.getModelo() + ", é de " + roxo.getAno_fabrico() + ".");



    }
    }



