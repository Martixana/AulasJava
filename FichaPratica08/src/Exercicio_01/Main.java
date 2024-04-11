package Exercicio_01;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João", 23, 1.89);
        Pessoa pessoa2 = new Pessoa("Maria", 43, 1.50);

        Pessoa pessoa3 = new Pessoa("Mark", 21, 1.89);

        Pessoa pessoa4 = new Pessoa("Luana", 17, 1.79);

        Pessoa pessoa5 = new Pessoa("John", 23, 1.93);

        //print ages directly via the method in Pessoa file
        pessoa5.printAge();

        //Use getter methods in sout statements
        System.out.println("Olá o meu nome é " + pessoa5.getNome() + ". Tenho " + pessoa5.getIdade() + " anos de idade e " + pessoa5.getAltura() + " metros de altura.");

        System.out.println("Olá o meu nome é " + pessoa1.getNome() + ". Tenho " + pessoa1.getIdade() + " anos de idade e " + pessoa1.getAltura() + " metros de altura.");

        System.out.println("Olá o meu nome é " + pessoa2.getNome() + ". Tenho " + pessoa2.getIdade() + " anos de idade e " + pessoa2.getAltura() + " metros de altura.");

        System.out.println("Olá o meu nome é " + pessoa3.getNome() + ". Tenho " + pessoa3.getIdade() + " anos de idade e " + pessoa3.getAltura() + " metros de altura.");

        System.out.println("Olá o meu nome é " + pessoa4.getNome() + ". Tenho " + pessoa4.getIdade() + " anos de idade e " + pessoa4.getAltura() + " metros de altura.");

        // print age via sout (here we use the getIdade method)
        System.out.println( pessoa4.getIdade());

        //reset pessoa5's name to nickname
        pessoa5.setNome_to_nickname("Johnny");

        System.out.print(pessoa5.getNome());
        System.out.println();

        System.out.println("Olá o meu nome é " + pessoa5.getNome() + ". Tenho " + pessoa5.getIdade() + " anos de idade e " + pessoa5.getAltura() + " metros de altura.");


    }

}
