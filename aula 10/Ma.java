abstract class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    abstract double calcularBonus();
}

class Gerente extends Funcionario {
    Gerente(String nome, double salario) {
        super(nome, salario);
    }

    double calcularBonus() {
        return salario * 0.2;
    }
}

class Vendedor extends Funcionario {
    Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    double calcularBonus() {
        return salario * 0.1;
    }
}

public class Ma {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new Gerente("Carlos", 5000),
            new Vendedor("Ana", 3000)
        };

        for (Funcionario f : funcionarios) {
            System.out.println(f.nome + ": " + f.calcularBonus());
        }
    }
}