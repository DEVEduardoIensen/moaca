public class Ex3 {
    public static void main(String[] args) {
        int[] vetor = {3, 8, 5, 12, 7, 10, 1, 4, 9, 6};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}