package SOLID;

public class Livro {
    public String titulo;
    public String autor;
    public int id;
    public String genero;
    public double nota;
    public int quantidade;

    Livro(String titulo, String autor, int id, String genero, double nota, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.genero = genero;
        this.nota = nota;
        this.quantidade = quantidade;
    }
}
