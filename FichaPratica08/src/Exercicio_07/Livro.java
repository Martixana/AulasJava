package Exercicio_07;

public class Livro {

    //attributes

   /* private String titulo;

    private String autor;

    private String categoria;

    private String num_paginas;

    private String isbn;*/


    //Constructor
    /*public Livro(String titulo, String autor, String cateogria, String num_paginas, String isbn){
        this.titulo = titulo;

        this.autor = autor;

        this.categoria = cateogria;

        this.num_paginas = num_paginas;

        this.isbn = isbn;

    }*/

    //Methods
    public String[] exibirDetalhes(){

        //attributes
        String titulo ;

        String autor;

        String categoria;

        String num_paginas;

        String isbn;

        //create actual array
         String[] arrayLivro = new String[5];
         arrayLivro[0] = titulo;
         arrayLivro[1] = this.autor;
         arrayLivro[2] = this.categoria;
         arrayLivro[3] = this.num_paginas;
         arrayLivro[4] = this.isbn;


         return arrayLivro;

    }
}
