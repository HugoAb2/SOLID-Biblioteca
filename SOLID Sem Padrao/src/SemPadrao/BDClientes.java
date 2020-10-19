package SemPadrao;

import java.util.ArrayList;

public class BDClientes {
    ArrayList<Cliente> bdClientes = new ArrayList<>();

    public Cliente procurarCliente(Cliente x) {
        for (Cliente cliente : bdClientes) {
            if (cliente == x) {
                System.out.println("O cliente " + x.nome + " foi encontrado.\n");
                System.out.println("Nome: " + cliente.nome + "\n" +
                        "CPF: " + cliente.CPF + "\n" +
                        "Telefone: " + cliente.telefone + "\n" +
                        "Email: " + cliente.email + "\n" +
                        "Senha: " + cliente.senha + "\n" +
                        "ID: " + cliente.idCliente + "\n");
                return cliente;
            }
        }
        return null;
    }

    public void addCliente(Cliente x) {
        bdClientes.add(x);
        System.out.println("O cliente " + x.nome + " foi adicionado com sucesso.\n");
    }

    public void removerClientes(Cliente x) {
        bdClientes.remove(x);
        System.out.println("O cliente " + x.nome + " foi removido com sucesso.\n");
    }

    public void listarClientes() {
        for(Cliente cliente: bdClientes) {
            System.out.println("Nome: " + cliente.nome + "\n" +
                    "CPF: " + cliente.CPF + "\n" +
                    "Telefone: " + cliente.telefone + "\n" +
                    "Email: " + cliente.email + "\n" +
                    "Senha: " + cliente.senha + "\n" +
                    "ID: " + cliente.idCliente + "\n");
        }
    }
}
