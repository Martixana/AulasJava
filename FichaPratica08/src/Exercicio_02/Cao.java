package Exercicio_02;


import com.sun.source.tree.ReturnTree;

public class Cao {

 //atributos
    private String nome;

    private String raca;

    private String latido = "au au au";

    //Constructor
    public Cao(String nome, String raca){
        this.nome =nome;
        this.raca = raca;
    }

    //Métodos

    //methods to grab attributes
    public String getNome() {
    return nome;
    }
    public String getRaca(){
        return raca;
    }
    public String getLatido(){
        return latido;
    }

    //Method to set (reset) attribute
    public void setLatido(String novoLatido){
        this.latido = novoLatido;

    }

    //method to print out bark attribute
    public void ladrar(){
        System.out.println(this.latido);
    }


}


