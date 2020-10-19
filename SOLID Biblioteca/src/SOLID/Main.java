package SOLID;

import SOLID.Lists.ListaClientesBiblioteca;
import SOLID.Lists.ListaLivrosBiblioteca;
import SOLID.Users.Bibliotecario;
import SOLID.Users.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("joao", 555, 01, 225252, "thearroba", "xxx");
        Cliente cliente2 = new Cliente("juao", 556, 02, 225253, "thearrobau", "xxt");

        Bibliotecario bibliotecario = new Bibliotecario("joaona", 555, 03, 225252, "thearrobu", "xxx");

        ListaClientesBiblioteca bdClientes = new ListaClientesBiblioteca();
        bdClientes.adicionarCliente(cliente);
        bdClientes.adicionarCliente(cliente2);

        bdClientes.exibirLista();
        bdClientes.procurarCliente(cliente2);

        Livro livro1 = new Livro("A revolução dos bichos", "George Orwell",
                111, "Ficção", 9.8, 8);
        Livro livro2 = new Livro("1984", "George Orwell",
                222, "Ficção", 9.4, 12);

        ListaLivrosBiblioteca bdlivros = new ListaLivrosBiblioteca();

        bdlivros.adicionar(livro1);
        bdlivros.adicionar(livro2);
        bdlivros.exibirLista();

        cliente.alugarLivro(livro1);
        cliente.visualizarListaLivrosCliente();
    }
}
