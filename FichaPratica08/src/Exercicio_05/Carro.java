package Exercicio_05;

public class Carro {

    //create attributes
    private String marca;
    private String modelo;
    private int ano_fabrico;

    //Constructor
    public Carro(String marca, String modelo, int ano_fabrico){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabrico = ano_fabrico;
    }

    // Object Methods



    public String ligar(){
        return("O carro está ligado");
    }

     //getters just to grab the specific attributes to add to a phrase, or print on their own
    //by calling the method
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public int getAno_fabrico(){
        return ano_fabrico;
    }

    public int setAno_fabrico(int novoAno_fabrico){
        return this.ano_fabrico = novoAno_fabrico;
    }


}
