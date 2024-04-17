package Exercicio_10;

public class Funcionario {

    //attributes
    private String nome;
    private double salario;
    private String departamento;


    //Constructor
    public Funcionario(String nome, double salario, String departamento){
        this.nome =nome;
        this.salario=salario;
        this.departamento=departamento;
    }



    //Methods


    //exibirDados
    public void exibirDados(){
        System.out.println("Name: " + this.nome);
        System.out.println("Salary: " + this.salario);
        System.out.println("Department: " + this.departamento);
    }

    //aumentarSalario
    public void aumentarSalario(double percentagem_aumento){
        this.salario = this.salario + (this.salario * percentagem_aumento);
        System.out.println(this.salario);
    }

    //getter for Salario which can be used after salary is increased, to print new salary
    public double getSalario() {
        return salario;
    }
}
