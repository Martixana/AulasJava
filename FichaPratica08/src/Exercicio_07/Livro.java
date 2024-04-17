package Exercicio_07;

public class Livro {

    //attributes
        private String titulo;

        private String autor;

        private String categoria;

        private int num_paginas;

        private String isbn;





    //Constructor
    public Livro(String titulo, String autor, String cateogria, int num_paginas, String isbn){
        this.titulo = titulo;

        this.autor = autor;

        this.categoria = cateogria;

        this.num_paginas = num_paginas;

        this.isbn = isbn;

    }

    //Methods
    public void exibirDetalhes(){

        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Número de páginas: " + this.num_paginas);
        System.out.println("ISBN: " + this.isbn);

    }
}
