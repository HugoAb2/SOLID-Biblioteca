package SOLID.Users;

import SOLID.*;
import SOLID.Lists.ListaClientesBiblioteca;
import SOLID.Lists.ListaLivrosBiblioteca;

public class Bibliotecario extends Usuario implements InterfaceUsuario, InterfaceBibliotecario {
    ListaClientesBiblioteca bdClientes = new ListaClientesBiblioteca();
    ListaLivrosBiblioteca listaLivrosBiblioteca = new ListaLivrosBiblioteca();

    public Bibliotecario(String nome, int CPF, int id, int telefone, String email, String senha ) {
        super(nome, CPF, id, telefone, email, senha);
    }

    @Override
    public void visualizarListaLivros() {
        listaLivrosBiblioteca.exibirLista();
    }

    @Override
    public void visualizarListaClientes() { bdClientes.exibirLista(); }

    public Livro procurarLivro(Livro x){
        listaLivrosBiblioteca.procurarLivro(x);
        System.out.println("Livro "+ x.titulo + "encontrado\n");
        return x;
    }

    public void cadastrarLivro(Livro livro) {
        listaLivrosBiblioteca.adicionar(livro);
        System.out.println("Livro cadastrado com sucesso\n");
    }

    public void cadastrarCliente(Cliente cliente){
        bdClientes.adicionarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso\n");
    }

}
