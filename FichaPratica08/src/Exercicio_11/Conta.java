package Exercicio_11;

public class Conta {

    //attributes
    private int num_conta;
    private double saldo_conta;

    private String titular;


    //constructor
    public Conta(int num_conta, double saldo_conta, String titular ){
        this.num_conta = num_conta;
        this.saldo_conta = saldo_conta;
        this.titular = titular;
    }

 //Metodos


    //getter method
    public double getSaldo(){
        return saldo_conta;
    }

    //transfer method
    public void transferencia(double valor_transferencia, Conta contaDestino ){
        //if this account still has 50 when done with transfer and transfer isn't asking for more than is in the ACCOUNT
        if(this.saldo_conta > 50 && this.saldo_conta > valor_transferencia){
            System.out.println( "Transferência efetuada: " + valor_transferencia + "€" );
            this.saldo_conta -= valor_transferencia;
            contaDestino.saldo_conta += valor_transferencia;
        }else{
            System.out.println("Não tem saldo suficiente para realizar esta transferência.");
        }

    }
    //Metodo depositar
    public void depositar(double montante){
        System.out.println("Depósito Efetuado: " + montante + "€");
       this.saldo_conta += montante;
    }

    //Metodo levantar
    public void levantar(double montante) {
        if (this.saldo_conta > 25) {
            System.out.println("Levantamento Efetuado: " +  montante + "€" );
            this.saldo_conta -= montante;
        } else {
            System.out.println("Não tem saldo suficiente para fazer levantamentos");
        }
    }



    //method to print saldo
    public void exibirSaldo(){
        System.out.println( "Número Conta: " + this.num_conta);
        System.out.println( "Titular: " + this.titular);
        System.out.println( "Saldo: " + this.saldo_conta +"€");
    }



    }









