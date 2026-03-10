import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        Random r = new Random();

        int indice = r.nextInt(nomes.size());

        String sorteado = nomes.get(indice);

        System.out.println("Nome sorteado: " + sorteado);

    }

}