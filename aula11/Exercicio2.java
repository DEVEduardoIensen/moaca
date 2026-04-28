interface Autenticavel {
    boolean autenticar(String senha);
}

class Usuario implements Autenticavel {
    @Override
    public boolean autenticar(String senha) { return "1234".equals(senha); }
}

class Administrador implements Autenticavel {
    @Override
    public boolean autenticar(String senha) { return "admin".equals(senha); }
}

public class Exercicio2 {
    public static void main(String[] args) {
        Autenticavel u = new Usuario();
        Autenticavel a = new Administrador();
        System.out.println(u.autenticar("1234"));
        System.out.println(a.autenticar("senha_errada"));
    }
}