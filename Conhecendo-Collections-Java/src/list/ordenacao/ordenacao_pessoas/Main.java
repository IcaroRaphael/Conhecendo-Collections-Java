package list.ordenacao.ordenacao_pessoas;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        for(Pessoa p : ordenacaoPessoas.getPessoaList()){
            System.out.println(p);
        }
        System.out.println();

        // Ordenando e exibindo por idade
        for(Pessoa p : ordenacaoPessoas.ordenarPorIdade()){
            System.out.println(p);
        }
        System.out.println();

        // Ordenando e exibindo por altura
        for(Pessoa p : ordenacaoPessoas.ordenarPorAltura()){
            System.out.println(p);
        }
        System.out.println();
    }
}
