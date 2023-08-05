package br.com.ebac;

public class PrimeiraClasse {

    public static void main (String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        cliente.cadastrarEndereco("Asa Norte Rua 02");

        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Código do cliente: " + cliente.getCodigo());
    }
}
