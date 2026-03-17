package lista1;

class Lampada {
    boolean ligada;
    int potencia = 40;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
        potencia = 0;
    }

    public void meialuz() {
        ligada = true;
        potencia = 20;
    }

    public static void main(String[] args) {
        Lampada top = new Lampada();

        top.ligar();
        System.out.println("Ligada: " + top.ligada + " potencia: " + top.potencia);

        top.desligar();
        System.out.println("  Ligada:  " + top.ligada + "  potencia: " + top.potencia);

        top.meialuz();
        System.out.println("   Ligada:    " + top.ligada + "  potencia:  " + top.potencia);
    }
}