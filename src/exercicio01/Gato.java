package exercicio01;

public class Gato extends Animal {
    public Gato(String nome, Integer peso) {
        super(nome, peso);
    }

    public String som() {
        return "miau";
    }

    public Integer quantidadeDeRacao() {
        int gramas;

        if (peso <= 3) {
            gramas = 10;
        } else {
            gramas = 13;
        }

        return gramas * peso;
    }
}
