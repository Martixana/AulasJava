package Exercicio_07;

public class Main {

    public static void main(String[] args) {

        //Instantiate object Livro
        Livro a = new Livro("A Terrible, Horrible, No Good Very Bad Day", "JTM", "Children", 11, "1232456");

        Livro b = new Livro("Grapes Of Wrath", "JS", "Classics", 643, "1232433");

        Livro c = new Livro("Who Fears Death?", "NO", "Afrofuturism", 309, "1232408");

        a.exibirDetalhes();

        System.out.println();

        c.exibirDetalhes();

    }
}
