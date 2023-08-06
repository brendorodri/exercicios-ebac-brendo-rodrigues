package br.com.ebac;

public class PrimeiraClasse {

    public static void main (String[] args) {
        Cliente cliente = new Cliente();

        cliente.cadastrarNomeCliente("Brendo Rodrigues");
        cliente.setCodigo(1);
        cliente.cadastrarEndereco("Vila Sao Jose");

        System.out.println("Codigo do Cliente: " + cliente.getCodigo());
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Endereco: " + cliente.getEndereco());
    }
}
