package exercicio01;

public class Main {

    public static void main(String[] args) {
        Animal gataDaphne = new Gato( "Daphne", 20);
        Animal gataArtemis = new Gato( "Artemis", 3);
        Animal cachorroXereta = new Cachorro( "Xereta", 10);
        Animal cachorroVictorHugo = new Cachorro( "Victor Hugo", 5);

        int totalRacaoConsumida = gataDaphne.quantidadeDeRacao() +
                gataArtemis.quantidadeDeRacao() +
                cachorroXereta.quantidadeDeRacao() +
                cachorroVictorHugo.quantidadeDeRacao();

        System.out.println("Quantidade total de ração consumida: " + totalRacaoConsumida);
    }

}
