class Forma {
    public double area() {
        return 0;
    }
}

class Retangulo extends Forma {
    double largura;
    double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double area() {
        return largura * altura;
    }
}

class Circulo extends Forma {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {
        Forma[] formas = {
            new Retangulo(4, 5),
            new Circulo(3),
            new Retangulo(2, 7),
            new Circulo(1.5)
        };

        double somaAreas = 0;
        for (Forma f : formas) {
            somaAreas += f.area();
        }

        System.out.println("Soma das áreas: " + somaAreas);
    }
}