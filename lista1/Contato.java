public class Contato {

    private String nome;
    private String telefone;

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String t) {
        if (t != null && t.length() >= 8) {
            telefone = t;
        } else {
            System.out.println("Número inválido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public static void main(String[] args) {

        Contato c = new Contato();

        c.setNome("Eduardo");

        c.setTelefone("123");
        c.setTelefone("99998888");

        System.out.println(c.getNome());
        System.out.println(c.getTelefone());
    }
}