import java.util.Random;

public class Dado {

    public int rolar() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }

    public static void main(String[] args) {

        Dado d1 = new Dado();
        Dado d2 = new Dado();

        int v1 = d1.rolar();
        int v2 = d2.rolar();

        int soma = v1 + v2;

        System.out.println("Dado 1: " + v1);
        System.out.println("Dado 2: " + v2);
        System.out.println("Soma: " + soma);

        if (soma == 7 || soma == 11) {
            System.out.println("Você ganhou!");
        } else if (soma == 2 || soma == 3 || soma == 12) {
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Tente de novo");
        }
    }
}