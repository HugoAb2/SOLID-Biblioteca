package SOLID.Lists;

import SOLID.Livro;
import SOLID.Users.InterfaceCliente;

import java.util.ArrayList;

public class ListaLivrosBiblioteca extends Lista implements InterfaceCliente {
    ArrayList<Livro> livros = new ArrayList<>();

    public Livro procurarLivro(Livro x) {
        boolean found = false;
        try {
            for (Livro livro : livros) {
                if (livro == x) {
                    System.out.println("O livro " + x.titulo + " foi encontrado.\n");
                    System.out.println("Titulo: " + livro.titulo + "\n" +
                            "Autor: " + livro.autor + "\n" +
                            "Genero: " + livro.genero + "\n" +
                            "Nota: " + livro.nota + "\n" +
                            "ID: " + livro.id + "\n" +
                            "Quantidade: " + livro.quantidade + "\n");
                    found = true;
                    return livro;
                }
            }
        }finally {
            if(!found)System.out.println("Livro nao encontrado");
        }
        return null;
    }

    public void alugarLivro(Livro x){
        procurarLivro(x);
        if(x.quantidade==0) {
            System.out.println("Livro indisponivel\n");
        }else{
            atualizarLista(x, "alugar");
        }
    }

    public void devolverLivro(Livro x){
        atualizarLista(x, "devolver");
    }

    protected void atualizarLista(Livro x, String op){
        switch (op) {
            case "alugar":
                x.quantidade -=1;
                break;

            case "devolver":
                x.quantidade +=1;
                break;
        }
    }

    public void adicionar(Livro x) {
        livros.add(x);
        System.out.println("O livro " + x.titulo + " foi adicionado com sucesso.\n");
    }

    public void remover(Livro x) {
        livros.remove(x);
        System.out.println("O livro " + x.titulo + " foi removido com sucesso.\n");
    }

    public void exibirLista() {
        try{
            System.out.println("Livros cadastrados no sistema:\n");
            for(Livro livro: livros) {
                System.out.println("Titulo: " + livro.titulo + "\n" +
                        "Autor: " + livro.autor + "\n" +
                        "Genero: " + livro.genero + "\n" +
                        "Nota: " + livro.nota + "\n" +
                        "ID: " + livro.id + "\n" +
                        "Quantidade: " + livro.quantidade + "\n");
            }
        }finally {
            if(livros.isEmpty()) System.out.println("Lista Vazia");
        }
    }
}
