import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " (" + quantidade + ") - R$ " + preco;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 25.90, 3));
        produtos.add(new Produto("Feijão", 8.50, 5));
        produtos.add(new Produto("Macarrão", 4.20, 10));

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
    }
}