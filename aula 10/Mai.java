abstract class Veiculo {
    String marca;
    String modelo;

    Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    abstract void acelerar();

    void exibirDados() {
        System.out.println(marca + " " + modelo);
    }
}

class Carro extends Veiculo {
    Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    void acelerar() {
        System.out.println("Carro acelerando");
    }
}

class Moto extends Veiculo {
    Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    void acelerar() {
        System.out.println("Moto acelerando");
    }
}

public class Mai {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");
        Moto moto = new Moto("Honda", "CG");

        carro.exibirDados();
        carro.acelerar();

        moto.exibirDados();
        moto.acelerar();
    }
}