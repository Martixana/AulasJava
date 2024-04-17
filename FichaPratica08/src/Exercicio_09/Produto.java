package Exercicio_09;

public class Produto {

    //attributes
    private String nome;

    private double preco;

    private int quantidade_stock = 0;


    //Constructor
    //Don´t need the quantidade_stock, because it has already been initialized to zero. Will be the same for all instances
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }

    public int getQuantidade_stock() {
        return quantidade_stock;
    }


//method comprar

    public void buy_stock(int buy_amount){
        this.quantidade_stock += buy_amount;
        estado();
    }


    //method vender


    public void sell_stock(int sell_amount) {
           if (this.quantidade_stock >= sell_amount) {
               this.quantidade_stock -= sell_amount;
           }else{
               System.out.println("Não existe stock suficiente para fazer essa venda");
           }
           estado();
        }





public void estado(){
        if(this.quantidade_stock<10){
            System.out.println("Nível crítico de stock, adquira mais deste produto em breve");
        }
}





}
