package SOLID.Lists;

import SOLID.Users.Cliente;

import java.util.ArrayList;

public class ListaClientesBiblioteca {
    ArrayList<Cliente> bdClientes = new ArrayList<>();

    public Cliente procurarCliente(Cliente x) {
        boolean found = false;
        try {
            for (Cliente cliente : bdClientes) {
                if (cliente == x) {
                    System.out.println("O cliente " + x.nome + " foi encontrado.\n");
                    System.out.println("Nome: " + cliente.nome + "\n" +
                            "CPF: " + cliente.CPF + "\n" +
                            "Telefone: " + cliente.telefone + "\n" +
                            "Email: " + cliente.email + "\n" +
                            "Senha: " + cliente.senha + "\n" +
                            "ID: " + cliente.id + "\n");
                    found = true;
                    return cliente;
                }
            }
        }finally {
            if(!found){ System.out.println("Cliente nao cadastrado");}
        }
        return null;
    }

    public void adicionarCliente(Cliente x) {
        bdClientes.add(x);
        System.out.println("O cliente " + x.nome + " foi adicionado com sucesso.\n");
    }

    public void removerCliente(Cliente x) {
        bdClientes.remove(x);
        System.out.println("O cliente " + x.nome + " foi removido com sucesso.\n");
    }

    public void exibirLista()  {
        try {
            for (Cliente cliente : bdClientes) {
                System.out.println("Nome: " + cliente.nome + "\n" +
                        "CPF: " + cliente.CPF + "\n" +
                        "Telefone: " + cliente.telefone + "\n" +
                        "Email: " + cliente.email + "\n" +
                        "Senha: " + cliente.senha + "\n" +
                        "ID: " + cliente.id + "\n");
            }
        }finally {
            if(bdClientes.isEmpty()) System.out.println("Lista vazia");
        }
    }
}
