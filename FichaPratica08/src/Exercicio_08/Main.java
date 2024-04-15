package Exercicio_08;

public class Main {

    public static void main(String[] args) {

        //instances of object aluno
        Aluno a = new Aluno("John", 18, "Social Sciences", 17);
        Aluno b = new Aluno("Jooana", 18, "Architecture", 19);

        //apply methods to instances
        System.out.println("Situação de A: " + a.pass_or_not());

        System.out.println("Situação de B: " + b.pass_or_not());





    }



}


