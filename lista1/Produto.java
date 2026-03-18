public class Produto {

    String nome;
    double precoCusto;
    double precoVenda;
    int qtdEstoque;

    public double lucroPresumido() {
        return (precoVenda - precoCusto) * qtdEstoque;
    }

    public void vender(int qtd) {
        if (qtd <= qtdEstoque) {
            qtdEstoque = qtdEstoque - qtd;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public static void main(String[] args) {

        Produto p = new Produto();

        p.nome = "Teclado";
        p.precoCusto = 50;
        p.precoVenda = 100;
        p.qtdEstoque = 10;

        p.vender(5);
        p.vender(10);

        System.out.println("Estoque: " + p.qtdEstoque);
        System.out.println("Lucro: " + p.lucroPresumido());
    }
}