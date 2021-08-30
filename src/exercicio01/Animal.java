package exercicio01;

public abstract class Animal {

    protected String nome;

    protected Integer peso;

    public Animal(String nome, Integer peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public abstract String som();

    public abstract Integer quantidadeDeRacao();
}
