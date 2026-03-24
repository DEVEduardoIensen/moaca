class Veiculo {
    public void mover() {
        System.out.println("O veículo está se movendo");
    }
}

class Carro extends Veiculo {
    public void mover() {
        System.out.println("O carro está andando");
    }
}

class Bicicleta extends Veiculo {
    public void mover() {
        System.out.println("A bicicleta está pedalando");
    }
}

public class Main {
    public static void chamarMover(Veiculo v) {
        v.mover();
    }

    public static void main(String[] args) {
        Carro c = new Carro();
        Bicicleta b = new Bicicleta();
        Veiculo v = new Veiculo();

        chamarMover(c);
        chamarMover(b);
        chamarMover(v);
    }
}