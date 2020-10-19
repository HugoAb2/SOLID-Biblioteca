package SOLID.Users;

import SOLID.Livro;
import SOLID.Users.InterfaceUsuario;

public abstract class Usuario implements InterfaceUsuario {
    public String nome;
    public int CPF;
    public int id;
    public int telefone;
    public String email;
    public String senha;

    public Usuario(String nome, int CPF, int id, int telefone, String email, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public abstract void visualizarListaLivros();

    public abstract Livro procurarLivro(Livro livro);
}
