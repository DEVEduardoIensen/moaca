public class Elevador {

    double andarAtual;
    double pesoAtual;
    double pesoMaximo;

    public void entrar(double pesoPessoa) {
        pesoAtual = pesoAtual + pesoPessoa;

        if (pesoAtual > pesoMaximo) {
            System.out.println("Sobrecarga no elevador");
        } else {
            andarAtual = andarAtual + 1;
        }
    }

    public void sair(double pesoPessoa) {
        pesoAtual = pesoAtual - pesoPessoa;
    }

    public static void main(String[] args) {

        Elevador e = new Elevador();

        e.pesoMaximo = 300;

        e.entrar(100);
        e.entrar(120);
        e.entrar(150);

        e.sair(100);

        System.out.println("Peso atual: " + e.pesoAtual);
        System.out.println("Andar atual: " + e.andarAtual);
    }
}