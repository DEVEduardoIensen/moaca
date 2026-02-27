import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = {5, 8, 12, 3, 9, 21};

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean achou = false;

        for (int i = 0; i < 6; i++) {
            if (vetor[i] == num) {
                achou = true;
            }
        }

        if (achou) {
            System.out.println("Encontrado");
        } else {
            System.out.println("Não encontrado");
        }
        sc.close();
    }
}