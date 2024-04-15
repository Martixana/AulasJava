package Exercicio_09;

public class Main {
    public static void main(String[] args) {

        //instance of object

        Produto um = new Produto("envelope", 20);

        System.out.println("Stock atual: "+um.getQuantidade_stock());
        um.buy_stock(595);

        System.out.println("Stock atual: "+um.getQuantidade_stock());
        um.sell_stock(2000);

        System.out.println("Stock atual: "+um.getQuantidade_stock());
        um.sell_stock(500);

        System.out.println("Stock atual: "+um.getQuantidade_stock());
        um.sell_stock(90);

        System.out.println("Stock atual: "+um.getQuantidade_stock());
    }
}
