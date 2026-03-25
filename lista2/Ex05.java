package lista2;



import java.util.ArrayList;

class Item {
    String nome;
    double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
    public String toString() {
        return "Item: " + nome + " | R$ " + preco;
    }
}

public class Ex05 {
    public static void main(String[] args) {

        ArrayList<Item> mercado = new ArrayList<Item>();

        mercado.add(new Item("Arroz", 5.99));
        mercado.add(new Item("Feijão", 7.49));
        mercado.add(new Item("Macarrão", 3.20));
        mercado.add(new Item("Óleo", 8.75));

        
        for (Item item : mercado) {
            System.out.println(item);
        }
    }
}
