package br.com.projeto.modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Produto implements ISujeito{

    private static int id_counter = 0;

    private List<IObservador> observadores;
    private String nome;
    private static int id;
    private Double preco;
    private int estoque;

    public Produto( String nome, Double preco, int estoque) {
        this.observadores = new ArrayList<>();
        this.nome = nome;
        this.id =  id_counter;
        this.preco = preco;
        this.estoque = estoque;

        id_counter++;
    }

    @Override
    public void addObservador(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void removeObservador(IObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservador() {
        DecimalFormat df = new DecimalFormat("0.00");
        for (IObservador observador : observadores){
            observador.update(nome + " está disponivel para compra por R$ " + df.format(preco) +
                                " com somente " + estoque + " no estoque!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void addEstoque(int estoque) {
        this.estoque = this.estoque + estoque;
        this.notificarObservador();
    }

}
