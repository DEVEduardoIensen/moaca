import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        
        int categoria;
        if (imc < 18.5) {
            categoria = 1;
        } else if (imc <= 24.9) {
            categoria = 2;
        } else {
            categoria = 3;
        }

        
        switch (categoria) {
            case 1:
                System.out.println("Você está abaixo do peso.");
                break;
            case 2:
                System.out.println("Você está no peso ideal!");
                break;
            case 3:
                System.out.println("Você está acima do peso.");
                break;
            default:
                System.out.println("Categoria inválida.");
        }

        scanner.close();
    }
}