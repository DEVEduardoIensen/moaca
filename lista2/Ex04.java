package lista2;

import java.util.ArrayList;


class Contribuinte {
    double rendaBruta;

    public Contribuinte(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double calcularImposto() {
        return 0;
    }
}


class PessoaFisica extends Contribuinte {

    public PessoaFisica(double rendaBruta) {
        super(rendaBruta);
    }

    public double calcularImposto() {
        return rendaBruta * 0.15;
    }
}


class PessoaJuridica extends Contribuinte {

    public PessoaJuridica(double rendaBruta) {
        super(rendaBruta);
    }

    public double calcularImposto() {
        return rendaBruta * 0.10;
    }
}

public class Ex04 {
    public static void main(String[] args) {

        
        ArrayList<Contribuinte> lista = new ArrayList<Contribuinte>();

        lista.add(new PessoaFisica(3000.0));
        lista.add(new PessoaFisica(5000.0));
        lista.add(new PessoaJuridica(20000.0));
        lista.add(new PessoaJuridica(50000.0));

        double totalImposto = 0;

        
        for (Contribuinte c : lista) {
            double imposto = c.calcularImposto();
            System.out.println("Imposto: R$ " + imposto);
            totalImposto = totalImposto + imposto;
        }

        System.out.println("Total arrecadado: R$ " + totalImposto);
    }
}