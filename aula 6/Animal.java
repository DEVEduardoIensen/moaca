class Animal {

    private String nome;
    private String especie;

    public String consultar() {

        return "Nome: " + nome + " Especie: " + especie;

    }

    public void mudarNome(String novoNome) {

        if (novoNome != null && !novoNome.isEmpty()) {
            nome = novoNome;
        }

    }

}