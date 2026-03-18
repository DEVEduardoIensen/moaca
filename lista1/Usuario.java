public class Usuario {

    String login;
    String senha;
    int tentativasFalhas;
    boolean bloqueado;

    public boolean autenticar(String s) {

        if (bloqueado) {
            System.out.println("Usuário bloqueado");
            return false;
        }

        if (senha.equals(s)) {
            tentativasFalhas = 0;
            return true;
        } else {
            tentativasFalhas++;

            if (tentativasFalhas >= 3) {
                bloqueado = true;
                System.out.println("Usuário bloqueado");
            }

            return false;
        }
    }

    public static void main(String[] args) {

        Usuario u = new Usuario();

        u.login = "admin";
        u.senha = "123";

        System.out.println(u.autenticar("111"));
        System.out.println(u.autenticar("222"));
        System.out.println(u.autenticar("333"));
        System.out.println(u.autenticar("123"));
    }
}