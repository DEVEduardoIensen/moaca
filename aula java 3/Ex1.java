import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int maior;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            soma = soma + numeros[i];
        }

        maior = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        sc.close();
    }
}