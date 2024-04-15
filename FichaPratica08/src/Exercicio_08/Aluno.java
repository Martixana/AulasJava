package Exercicio_08;

public class Aluno {

    //attributes
    private String nome;
    private int idade;

    private String curso;
    private double media;

    //Constructor
    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;

    }

    //methods

    // method to grab average
    public void getMedia() {

        System.out.println(this.media);
    }

    //method to compare average
    public String pass_or_not(){
        if (this.media >= 10){
            return "Passed";
        }
        else{
            return "Failed";
        }

    }
}



