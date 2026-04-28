interface FormaGeometrica {
    double calcularArea();
}

class Circulo implements FormaGeometrica {
    private double raio;
    public Circulo(double raio) { this.raio = raio; }
    @Override
    public double calcularArea() { return Math.PI * raio * raio; }
}

class Retangulo implements FormaGeometrica {
    private double base, altura;
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() { return base * altura; }
}

public class Exercicio1 {
    public static void main(String[] args) {
        FormaGeometrica c = new Circulo(5);
        FormaGeometrica r = new Retangulo(10, 2);
        System.out.println(c.calcularArea());
        System.out.println(r.calcularArea());
    }
}