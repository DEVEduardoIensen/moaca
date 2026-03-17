class Funcionario {
    String nome;
    double salario;
}

class Gerente extends Funcionario {
    String setor;
}

public class Main{
    public static void main(String[] args) {
        Gerente g = new Gerente();

        g.nome = "Eduardo";
        g.salario = 50000.0;
        g.setor = "TI";

        System.out.println("Nome: " + g.nome);
        System.out.println("Salário: " + g.salario);
        System.out.println("Setor: " + g.setor);
    }
}