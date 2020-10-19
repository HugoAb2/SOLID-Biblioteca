package SemPadrao;

import java.util.ArrayList;

public class BDLivros {
    ArrayList<Livro> livros = new ArrayList<>();

    public Livro procurarLivro(Livro x) {
        for (Livro livro : livros) {
            if (livro == x) {
                System.out.println("O livro " + x.titulo + " foi encontrado.\n");
                System.out.println("Titulo: " + livro.titulo + "\n" +
                        "Autor: " + livro.autor + "\n" +
                        "Genero: " + livro.genero + "\n" +
                        "Nota: " + livro.nota + "\n" +
                        "ID: " + livro.id + "\n");
                return livro;
            }
        }
        return null;
    }

    public void addLivro(Livro x) {
        livros.add(x);
        System.out.println("O livro " + x.titulo + " foi adicionado com sucesso.\n");
    }

    public void removerLivro(Livro x) {
        livros.remove(x);
        System.out.println("O livro " + x.titulo + " foi removido com sucesso.\n");
    }

    public void listarLivros() {
        for(Livro livro: livros) {
            System.out.println("Titulo: " + livro.titulo + "\n" +
                    "Autor: " + livro.autor + "\n" +
                    "Genero: " + livro.genero + "\n" +
                    "Nota: " + livro.nota + "\n" +
                    "ID: " + livro.id + "\n");
        }
    }
}
