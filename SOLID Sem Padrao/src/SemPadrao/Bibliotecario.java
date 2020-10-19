package SemPadrao;

public class Bibliotecario {
    BDClientes bdClientes = new BDClientes();
    BDLivros bdLivros = new BDLivros();

    public String nome;
    private int cpf;
    private int idFuncionario;
    private int telefone;
    private String email;

    Bibliotecario(String nome, int cpf, int idFuncionario, int telefone, String email ) {
        this.nome = nome;
        this.cpf = cpf;
        this.idFuncionario = idFuncionario;
        this.telefone = telefone;
        this.email = email;
    }

    public void procurarLivro(Livro x){
        bdLivros.procurarLivro(x);
        System.out.println("ResponsabilidadeUnica.Livro "+ x.titulo + "encontrado\n");
    }

    public void cadastrarLivro(Livro livro) {
        bdLivros.addLivro(livro);
        System.out.println("ResponsabilidadeUnica.Livro cadastrado com sucesso\n");
    }

    public void cadastrarCliente(Cliente cliente){
        bdClientes.addCliente(cliente);
        System.out.println("SemPadrao.Cliente cadastrado com sucesso\n");
    }
    //dataDevolucao()
}
