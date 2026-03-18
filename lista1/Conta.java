public class Conta {

    private double saldo;
    private double limite;

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarStatus() {
        System.out.println("Saldo: " + saldo);

        if (saldo < 0) {
            System.out.println("Usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }

    public static void main(String[] args) {

        Conta c = new Conta();

        c.limite = 500;

        c.depositar(100);
        c.sacar(200);

        c.mostrarStatus();
    }
}