package br.com.projeto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public Produto getProduto(String nome){
        for (Produto produto:  this.produtos) {
            if(produto.getNome().equals(nome))
                return produto;
        }
        return null;
    }

}
