package PrimeiroPrograma.model;

public class Gato {
    private String Nome;
    private String cor;
    private int idade;

    public Gato() {    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Gato(int idade) {
        this.idade = idade;
    }

    public Gato(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
