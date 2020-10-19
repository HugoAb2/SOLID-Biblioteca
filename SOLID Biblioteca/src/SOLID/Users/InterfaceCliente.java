package SOLID.Users;

import SOLID.Livro;

public interface InterfaceCliente {
    void alugarLivro(Livro livro);
    void devolverLivro(Livro livro);
    Livro procurarLivro(Livro livro);
}
