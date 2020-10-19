package SOLID.Users;

import SOLID.Lists.Lista;
import SOLID.Lists.ListaLivrosBiblioteca;
import SOLID.Livro;

import java.util.ArrayList;

public class ListaDoCliente extends Lista {
    protected ListaLivrosBiblioteca livros;
    protected ArrayList<Livro> lista;

    public ListaDoCliente(ListaLivrosBiblioteca livros, ArrayList<Livro> lista){
        this.livros = livros;
        this.lista = lista;
    }

    protected void atualizarLista(Livro x, String op){
        switch (op) {
            case "alugar":
                livros.procurarLivro(x);
                lista.add(x);
                break;

            case "devolver":
                livros.procurarLivro(x);
                lista.remove(x);
                break;
        }
    }

    public void exibirLista() {
        System.out.println("Livros em sua posse:\n");
        for(Livro livro: lista) {
            System.out.println("Titulo: " + livro.titulo + "\n" +
                    "Autor: " + livro.autor + "\n" +
                    "Genero: " + livro.genero + "\n" +
                    "Nota: " + livro.nota + "\n" +
                    "ID: " + livro.id + "\n");
        }
        if(lista.isEmpty()) System.out.println("Lista Vazia\n");
    }

}
