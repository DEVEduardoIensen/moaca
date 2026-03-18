public class Termometro {

    double temperaturaAtual;

    public void aumentarTemp(double valor) {
        temperaturaAtual = temperaturaAtual + valor;
    }

    public void diminuirTemp(double valor) {
        temperaturaAtual = temperaturaAtual - valor;
    }

    public double exibirFahrenheit() {
        return temperaturaAtual * 1.8 + 32;
    }

    public static void main(String[] args) {

        Termometro t = new Termometro();

        t.temperaturaAtual = 25;

        t.aumentarTemp(5);
        t.diminuirTemp(2);

        System.out.println("Celsius: " + t.temperaturaAtual);
        System.out.println("Fahrenheit: " + t.exibirFahrenheit());
    }
}