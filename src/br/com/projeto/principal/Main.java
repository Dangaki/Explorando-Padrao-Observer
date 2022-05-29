package br.com.projeto.principal;

import br.com.projeto.modelo.Cliente;
import br.com.projeto.modelo.Loja;
import br.com.projeto.modelo.Produto;

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja();

        loja.addProduto(new Produto("Geladeira",2899.00,0));
        loja.addProduto(new Produto("Fogão",769.00,0));
        loja.addProduto(new Produto("Computador",1129.0,0));

        Cliente cliente1 = new Cliente("Daniel", "daniel@email.com");
        Cliente cliente2 = new Cliente("Gabriela", "gabriela@email.com");
        Cliente cliente3 = new Cliente("Agamemnon", "agamemnon@email.com");

        System.out.println("Primeira Notificação");
        Produto geladeira = loja.getProduto("Geladeira");
        geladeira.addObservador(cliente1);
        geladeira.addObservador(cliente2);
        geladeira.addObservador(cliente3);

        geladeira.addEstoque(50);// Já chama a função de notificar os Observadores

        System.out.println("\nSegunda Notificação");
        Produto fogao = loja.getProduto("Fogão");
        fogao.addObservador(cliente1);
        fogao.addObservador(cliente3);

        fogao.addEstoque(20);// Já chama a função de notificar os Observadores

        System.out.println("\nTerceira Notificação");
        Produto computador = loja.getProduto("Computador");
        computador.addObservador(cliente1);
        computador.addObservador(cliente2);
        computador.addObservador(cliente3);

        computador.addEstoque(1);// Já chama a função de notificar os Observadores

        System.out.println("\nQuarta Notificação");
        computador.removeObservador(cliente1);
        computador.removeObservador(cliente3);

        computador.addEstoque(2);// Já chama a função de notificar os Observadores
    }
}
