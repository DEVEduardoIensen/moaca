public class BombaCombustivel {

    String tipoCombustivel;
    double valorLitro;
    double quantidadeCombustivel;

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;

        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel = quantidadeCombustivel - litros;
            System.out.println("Abastecido: " + litros + " litros");
        } else {
            System.out.println("Combustível insuficiente");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= quantidadeCombustivel) {
            double valor = litros * valorLitro;
            quantidadeCombustivel = quantidadeCombustivel - litros;
            System.out.println("Valor a pagar: " + valor);
        } else {
            System.out.println("Combustível insuficiente");
        }
    }

    public static void main(String[] args) {

        BombaCombustivel b = new BombaCombustivel();

        b.tipoCombustivel = "Gasolina";
        b.valorLitro = 5.5;
        b.quantidadeCombustivel = 100;

        b.abastecerPorValor(55);
        b.abastecerPorLitro(10);

        System.out.println("Restante na bomba: " + b.quantidadeCombustivel);
    }
}