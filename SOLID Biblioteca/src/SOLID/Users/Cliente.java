package SOLID.Users;

import SOLID.Lists.ListaLivrosBiblioteca;
import SOLID.Livro;

import java.util.ArrayList;

public class Cliente extends Usuario implements InterfaceUsuario, InterfaceCliente {

    ListaLivrosBiblioteca listaLivrosBiblioteca = new ListaLivrosBiblioteca();
    ArrayList<Livro> listaLivros = new ArrayList<>();

    ListaDoCliente listaDoCliente = new ListaDoCliente(listaLivrosBiblioteca, listaLivros);

    public Cliente(String nome, int CPF, int id, int telefone, String email, String senha) {
        super(nome, CPF, id, telefone, email, senha);
    }

    public void alugarLivro(Livro livro) {
        listaLivrosBiblioteca.alugarLivro(livro);
        listaDoCliente.atualizarLista(livro, "alugar");
        System.out.println("Livro alugado por: " + this.nome);
    }

    public void devolverLivro(Livro livro) {
        listaLivrosBiblioteca.devolverLivro(livro);
        listaDoCliente.atualizarLista(livro, "devolver");
        System.out.println("Livro " + livro.titulo + " devolvido por: " + this.nome);
    }

    public Livro procurarLivro(Livro livro){
        listaLivrosBiblioteca.procurarLivro(livro);
        System.out.println("Livro "+ livro.titulo + "encontrado\n");
        return livro;
    }

    @Override
    public void visualizarListaLivros() { listaLivrosBiblioteca.exibirLista(); }


    public void visualizarListaLivrosCliente() { listaDoCliente.exibirLista(); }
}