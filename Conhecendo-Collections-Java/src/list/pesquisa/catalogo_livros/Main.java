package list.pesquisa.catalogo_livros;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println("Exibindo livros pelo mesmo autor: Robert C. Martin");
        for(Livro l : catalogoLivros.pesquisarPorAutor("Robert C. Martin")){
            System.out.println(l);
        }
        System.out.println();

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println("Exibindo livros pelo mesmo autor: Autor Inexistente");
        for(Livro l : catalogoLivros.pesquisarPorAutor("Autor Inexistente")){
            System.out.println(l);
        }
        System.out.println();

        // Exibindo livros dentro de um intervalo de anos
        System.out.println("Exibindo livros dentro de um intervalo de anos: 2010 - 2022");
        for(Livro l : catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022)){
            System.out.println(l);
        }
        System.out.println();

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println("Exibindo livros dentro de um intervalo de anos: 2025 - 2030");
        for(Livro l : catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030)){
            System.out.println(l);
        }
        System.out.println();

        // Exibindo livros por título
        System.out.println("Exibindo livros por título: Java Guia do Programador");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));
        System.out.println();

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println("Exibindo livros por título: Título Inexistente");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
        System.out.println();
    }
}
