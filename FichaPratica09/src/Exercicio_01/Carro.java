package Exercicio_01;

import java.time.*;
public class Carro {

    //attributes

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private tipoCombustivel combustivel;
    private double litros100km;





    //Constructor
    public Carro (String marca, String modelo, int ano, int potencia, int cilindrada, tipoCombustivel combustivel,  double litros100km ){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        //enum attribute
        this.combustivel = combustivel;
        this.litros100km = litros100km;

    }

    //methods

    //get current year


    //ligar methods


    // car under 30 yrs old and above 250 horsepower
    public void ligar(){

        int idade = 2024-this.ano;

        if(idade>30){
            // Carro antigo

            if(this.combustivel.equals(tipoCombustivel.DIESEL)){
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else{
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        }else{
            // Carro novo

            if(this.potencia>=250){
                System.out.println("O carro está ligado!");
                System.out.println("VRUUMMMMMMM");
            }else{
                System.out.println("O carro está ligado!");
                System.out.println("vrummmmmm");
            }
        }
    }


    //getters just to grab the specific attributes to add to a phrase, or print on their own
    //by calling the method
   /* public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public int getAno_fabrico(){
        return ano;
    }

    public int setAno_fabrico(int novoAno_fabrico){
        return this.ano = novoAno_fabrico;
    }
*/


    //create attributes
   /* private String marca;
    private String modelo;
    private int ano_fabrico;

    //Constructor
    public Carro(String marca, String modelo, int ano_fabrico){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabrico = ano_fabrico;
    }

    // Object Methods

    public String ligar(){
        return("O carro está ligado");
    }

    //getters just to grab the specific attributes to add to a phrase, or print on their own
    //by calling the method
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public int getAno_fabrico(){
        return ano_fabrico;
    }

    public int setAno_fabrico(int novoAno_fabrico){
        return this.ano_fabrico = novoAno_fabrico;
    }*/



}
