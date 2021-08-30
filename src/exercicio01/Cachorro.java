package exercicio01;

public class Cachorro extends Animal {
    public Cachorro(String nome, Integer peso) {
        super(nome, peso);
    }

    public String som() {
        return "auau";
    }

    public Integer quantidadeDeRacao() {
        int gramas;

        if (peso <= 4) {
            gramas = 40;
        } else if (peso > 4 && peso <= 12) {
            gramas = 45;
        } else {
            gramas = 55;
        }

        return gramas * peso;
    }
}
