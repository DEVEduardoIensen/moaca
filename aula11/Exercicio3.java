interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    @Override
    public void imprimir() { System.out.println("Relatorio..."); }
}

class Recibo implements Imprimivel {
    @Override
    public void imprimir() { System.out.println("Recibo..."); }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Imprimivel rel = new Relatorio();
        Imprimivel rec = new Recibo();
        rel.imprimir();
        rec.imprimir();
    }
}