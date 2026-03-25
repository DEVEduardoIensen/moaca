package lista2;




class Conteudo {
    String titulo;

    public Conteudo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return 0.0;
    }
}


class Filme extends Conteudo {

    public Filme(String titulo) {
        super(titulo);
    }

    public double getPreco() {
        return 10.0;
    }
}


class Serie extends Conteudo {
    int qtdEpisodios;

    public Serie(String titulo, int qtdEpisodios) {
        super(titulo);
        this.qtdEpisodios = qtdEpisodios;
    }

    public double getPreco() {
        return 2.0 * qtdEpisodios;
    }
}


class Documentario extends Conteudo {

    public Documentario(String titulo) {
        super(titulo);
    }

    public double getPreco() {
        return 5.0;
    }
}

public class Ex06 {
    public static void main(String[] args) {

        Conteudo c1 = new Filme("Matrix");
        Conteudo c2 = new Serie("Breaking Bad", 62);
        Conteudo c3 = new Documentario("Planeta Terra");

        System.out.println(c1.titulo + " - R$ " + c1.getPreco());
        System.out.println(c2.titulo + " - R$ " + c2.getPreco());
        System.out.println(c3.titulo + " - R$ " + c3.getPreco());
    }
}