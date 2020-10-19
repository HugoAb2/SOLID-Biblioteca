package SOLID.Users;

import SOLID.Livro;

public interface InterfaceUsuario {

    void visualizarListaLivros();
    Livro procurarLivro(Livro livro);
}
