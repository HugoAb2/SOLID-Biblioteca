package SOLID.Users;

import SOLID.Livro;

public interface InterfaceBibliotecario {
    void visualizarListaClientes();
    void cadastrarCliente(Cliente cliente);
    void cadastrarLivro(Livro livro);
}
