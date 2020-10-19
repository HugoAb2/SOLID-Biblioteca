package SemPadrao;

import java.util.ArrayList;

public class Cliente {
    protected String nome;
    protected int CPF;
    protected int idCliente;
    protected int telefone;
    protected String email;
    protected String senha;
    BDLivros livros = new BDLivros();
    ArrayList<Livro> controle = new ArrayList<>();

    public Cliente(String nome, int CPF, int idCliente, int telefone, String email, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.idCliente = idCliente;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public void alugarLivro(Livro livro) {
        livros.procurarLivro(livro);
        livro.quantidade -= 1;
        controle.add(livro);
        System.out.println("ResponsabilidadeUnica.Livro alugado por: " + this.nome);

    }

    public void devolverLivro(Livro livro) {
        livros.procurarLivro(livro);
        livro.quantidade += 1;
        controle.remove(livro);
        System.out.println("ResponsabilidadeUnica.Livro " + livro.titulo + " devolvido por: " + this.nome);
    }

    public void exibirLivros() {
        for(Livro livro: controle) {
            System.out.println("Titulo: " + livro.titulo + "\n" +
                    "Autor: " + livro.autor + "\n" +
                    "Genero: " + livro.genero + "\n" +
                    "Nota: " + livro.nota + "\n" +
                    "ID: " + livro.id + "\n");
        }
    }
}