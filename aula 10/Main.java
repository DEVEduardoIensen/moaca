abstract class Animal {
    abstract void emitirSom();
}

class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Au Au");
    }
}

class Gato extends Animal {
    void emitirSom() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animais = {
            new Cachorro(),
            new Gato()
        };

        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}