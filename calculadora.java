import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado;

        switch(op) {
            case '+':
                resultado = n1 + n2;
                break;

            case '-':
                resultado = n1 - n2;
                break;

            case '*':
                resultado = n1 * n2;
                break;

            case '/':
                resultado = n1 / n2;
                break;

            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}