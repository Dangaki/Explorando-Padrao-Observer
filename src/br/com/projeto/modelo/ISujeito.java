package br.com.projeto.modelo;

public interface ISujeito {
    void addObservador(IObservador observador);
    void removeObservador(IObservador observador);
    void notificarObservador();
}
