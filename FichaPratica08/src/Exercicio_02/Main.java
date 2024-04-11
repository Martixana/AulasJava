package Exercicio_02;

public class Main {
    public static void main(String[] args){

        //Instantiate Objects
        Cao caoX = new Cao("Jonas", "Pug");
        Cao caoY = new Cao("Jim", "Bulldog");
        Cao caoB = new Cao("Bobbi", "Frenchie");

        //Use methods to make instantiated dog objects bark automatically ( print included in the method)
        caoY.ladrar();

        caoX.ladrar();

        caoB.ladrar();

        //Use setter methods to change the bark for this specific dog object
        caoY.setLatido("woof woof!!!");
        caoB.setLatido("woofie auuuf!!!");

        System.out.println("O meu cão " + caoX.getNome() + " é um " + caoX.getRaca() + " e ladra assim: " +  caoX.getLatido());
        System.out.println("O meu cão " + caoY.getNome() + " ladra assim: " +  caoY.getLatido());
        System.out.println("O meu cão " + caoB.getNome() + " ladra assim: " +  caoB.getLatido());

        //Use bark method again after resetting it for dog B
        caoB.ladrar();

    }
}
