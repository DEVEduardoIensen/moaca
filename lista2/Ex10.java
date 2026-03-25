package lista2;



import java.util.ArrayList;


class Arquivo {
    String nome;
    double tamanho; 

    public Arquivo(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public void abrir() {
        System.out.println("Abrindo arquivo: " + nome);
    }
}


class Imagem extends Arquivo {

    public Imagem(String nome, double tamanho) {
        super(nome, tamanho);
    }

    public void abrir() {
        System.out.println("Mostrando foto: " + nome);
    }
}


class Texto extends Arquivo {

    public Texto(String nome, double tamanho) {
        super(nome, tamanho);
    }

    public void abrir() {
        System.out.println("Lendo texto: " + nome);
    }
}


class Video extends Arquivo {

    public Video(String nome, double tamanho) {
        super(nome, tamanho);
    }

    public void abrir() {
        System.out.println("Dando play: " + nome);
    }
}


class Pasta {
    String nomePasta;
    ArrayList<Arquivo> arquivos;

    public Pasta(String nomePasta) {
        this.nomePasta = nomePasta;
        this.arquivos = new ArrayList<Arquivo>();
    }

    
    public void adicionarArquivo(Arquivo a) {
        arquivos.add(a);
    }

    
    public void abrirTodos() {
        System.out.println("=== Abrindo pasta: " + nomePasta + " ===");
        for (Arquivo a : arquivos) {
            a.abrir(); 
        }
    }
}

public class Ex10 {
    public static void main(String[] args) {

        Pasta pasta = new Pasta("Meus Documentos");

        pasta.adicionarArquivo(new Imagem("foto_viagem.jpg", 3.5));
        pasta.adicionarArquivo(new Texto("relatorio.txt", 0.2));
        pasta.adicionarArquivo(new Video("aula_java.mp4", 150.0));
        pasta.adicionarArquivo(new Imagem("selfie.png", 2.1));

        pasta.abrirTodos();
    }
}
