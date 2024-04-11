package Exercicio_01;

public class Pessoa {

    //create attributes
    private String nome;

    private int idade;

    private double altura;


    //Constructor
    public Pessoa(String nome, int idade, double altura){
        this.nome=nome;
        this.idade=idade;
        this.altura=altura;
    }

    //Methods to grab attributes

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    //method to print out age
    public void printAge(){
        System.out.println(this.idade);
    }

    //Method to set (reset) attribute
    public void setNome_to_nickname(String novoNome){
        this.nome = novoNome;

    }

}
