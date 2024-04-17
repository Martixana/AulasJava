package Exercicio_10;

public class Main {
    public static void main(String[] args) {

        //instance of Funcionario
        Funcionario b = new Funcionario("Micaela", 23.000, "Logística" );

        b.exibirDados();
        b.aumentarSalario(0.10);

        System.out.println("Your new salary is " + b.getSalario());

    }
}
