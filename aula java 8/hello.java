class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}

class Aluno extends Pessoa {
    String matricula;

    Aluno(String nome, String matricula) {
        super(nome); 
        this.matricula = matricula;
    }
}

public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno("Eduardo", "123");

        System.out.println(a.nome);
        System.out.println(a.matricula);
    }
}