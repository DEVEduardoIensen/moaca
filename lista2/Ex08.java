package lista2;


class MetodoPagamento {
    public void processar(double valor) {
        System.out.println("Processando R$ " + valor);
    }
}


class Credito extends MetodoPagamento {
    public void processar(double valor) {
        double taxa = valor * 0.05;
        System.out.println("Cobrando R$ " + valor + " no cartão... Taxa de 5% = R$ " + taxa);
    }
}


class Debito extends MetodoPagamento {
    public void processar(double valor) {
        System.out.println("Cobrando R$ " + valor + " no débito... Sem taxa");
    }
}


class Criptomoeda extends MetodoPagamento {
    public void processar(double valor) {
        System.out.println("Convertendo R$ " + valor + " para Bitcoin...");
    }
}


class Loja {
    MetodoPagamento metodoPagamento;

    public Loja(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void finalizarCompra(double valor) {
        System.out.println("--- Finalizando compra ---");
        metodoPagamento.processar(valor); 
        System.out.println("Compra finalizada!");
    }
}

public class Ex08 {
    public static void main(String[] args) {

        
        Loja loja1 = new Loja(new Credito());
        loja1.finalizarCompra(150.0);

        System.out.println();

        
        Loja loja2 = new Loja(new Debito());
        loja2.finalizarCompra(80.0);

        System.out.println();

        
        Loja loja3 = new Loja(new Criptomoeda());
        loja3.finalizarCompra(300.0);
    }
}
