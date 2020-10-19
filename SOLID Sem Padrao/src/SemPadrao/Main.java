package SemPadrao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("joao", 555, 01, 225252, "thearroba", "xxx");
        Cliente cliente2 = new Cliente("juao", 556, 02, 225253, "thearrobau", "xxt");

        BDClientes bdClientes = new BDClientes();
        bdClientes.addCliente(cliente);
        bdClientes.addCliente(cliente2);

        //bdClientes.listarClientes();
        bdClientes.procurarCliente(cliente2);

        Livro livro1 = new Livro("A revolução dos bichos", "George Orwell",
                111, "Ficção", 9.8, 8);
        Livro livro2 = new Livro("1984", "George Orwell",
                222, "Ficção", 9.4, 12);

        BDLivros bdlivros = new BDLivros();

        bdlivros.addLivro(livro1);
        bdlivros.addLivro(livro2);

        bdlivros.listarLivros();

        cliente.alugarLivro(livro1);
        cliente.alugarLivro(livro2);
        cliente.exibirLivros();
        cliente.devolverLivro(livro2);
        cliente.exibirLivros();
    }
}
