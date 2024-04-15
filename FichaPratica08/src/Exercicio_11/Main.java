package Exercicio_11;

import Exercicio_10.Funcionario;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Instance of conta
        Conta a = new Conta(001, 200, "Andy");
        Conta b = new Conta(002, 80, "Rosa");
        Conta c = new Conta(003, 2100, "Duarte");

        a.exibirSaldo();
        System.out.println();
        a.depositar(1000);
        System.out.println();
        a.exibirSaldo();
        System.out.println();
        a.levantar(120);
        System.out.println();
        a.exibirSaldo();

        c.transferencia(3000, b);
        System.out.println();
        c.transferencia(300, b);
        System.out.println();

        a.exibirSaldo();
        System.out.println();
        b.exibirSaldo();
        System.out.println();
        c.exibirSaldo();


    }
}
