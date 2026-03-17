class Forma {
    String cor;
    boolean preenchida;
}

class Retangulo extends Forma {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }
}

class Circulo extends Forma {
    double raio;

    double calcularArea() {
        return 3.14 * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {

        Retangulo r = new Retangulo();
        r.largura = 5;
        r.altura = 3;

        Circulo c = new Circulo();
        c.raio = 2;

        System.out.println(r.calcularArea());
        System.out.println(c.calcularArea());
    }
}