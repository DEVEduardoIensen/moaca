class Aluno {

    private String nome;
    private double nota;

    public void adicionarNota(double valor) {

        if (valor > 0 && nota + valor <= 10) {
            nota = nota + valor;
        }

    }

    public void retirarNota(double valor) {

        if (valor > 0 && nota - valor >= 0) {
            nota = nota - valor;
        }

    }

    public double consultarNota() {
        return nota;
    }

}