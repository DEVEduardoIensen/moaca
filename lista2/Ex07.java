package lista2;




class Passagem {
    double precoBase;

    public Passagem(double precoBase) {
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal() {
        return precoBase;
    }
}


class Economica extends Passagem {

    public Economica(double precoBase) {
        super(precoBase);
    }

    public double calcularPrecoFinal() {
        return precoBase + (precoBase * 0.10);
    }
}


class Executiva extends Passagem {

    public Executiva(double precoBase) {
        super(precoBase);
    }

    public double calcularPrecoFinal() {
        return precoBase + (precoBase * 0.50);
    }
}


class PrimeiraClasse extends Passagem {

    public PrimeiraClasse(double precoBase) {
        super(precoBase);
    }

    public double calcularPrecoFinal() {
        return precoBase * 2;
    }
}

public class Ex07 {
    public static void main(String[] args) {

        Passagem p1 = new Economica(500.0);
        Passagem p2 = new Executiva(500.0);
        Passagem p3 = new PrimeiraClasse(500.0);

        System.out.println("Econômica:       R$ " + p1.calcularPrecoFinal());
        System.out.println("Executiva:       R$ " + p2.calcularPrecoFinal());
        System.out.println("Primeira Classe: R$ " + p3.calcularPrecoFinal());
    }
}
