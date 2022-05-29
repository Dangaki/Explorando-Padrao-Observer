package br.com.projeto.modelo;

public class Cliente implements IObservador{
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void update(String msg) {
        System.out.println("Mensagem para " + nome + " (" + email + ") - "+ msg);
    }
}
