public class Musica {

    String titulo;
    String artista;
    int duracao;

    public Musica(String t, String a, int d) {
        titulo = t;
        artista = a;
        duracao = d;
    }

    public String getDuracaoFormatada() {
        int min = duracao / 60;
        int seg = duracao % 60;

        String m = (min < 10 ? "0" : "") + min;
        String s = (seg < 10 ? "0" : "") + seg;

        return m + ":" + s;
    }

    public static void main(String[] args) {

        Musica m = new Musica("Musica X", "Artista Y", 230);

        System.out.println(m.titulo);
        System.out.println(m.artista);
        System.out.println(m.getDuracaoFormatada());
    }
}