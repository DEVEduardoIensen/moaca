public class Produto {

    private String nome;
    private double preco;

    public Produto() {

    }

    public Produto(String nome, double preco) {

        this.nome = nome;

        if (preco < 0) {
            this.preco = 0.0;
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }

    }

}