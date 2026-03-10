import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        Pessoa p = new Pessoa(nome, idade);

        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);

    }

}