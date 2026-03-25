package lista2;



class RedeSocial {
    String usuario;

    public RedeSocial(String usuario) {
        this.usuario = usuario;
    }

    public void postar(String mensagem) {
        System.out.println("Postando: " + mensagem);
    }
}


class Instagram extends RedeSocial {

    public Instagram(String usuario) {
        super(usuario); 
    }

    public void postar(String mensagem) {
        System.out.println("Postou foto no feed: " + mensagem);
    }
}


class Twitter extends RedeSocial {

    public Twitter(String usuario) {
        super(usuario);
    }

    public void postar(String mensagem) {
        
        if (mensagem.length() <= 280) {
            System.out.println("Tweetou: " + mensagem);
        } else {
            System.out.println("Texto muito longo");
        }
    }
}

public class Ex02 {
    public static void main(String[] args) {

        Instagram insta = new Instagram("joao123");
        insta.postar("Que dia lindo!");

        Twitter tw = new Twitter("maria456");
        tw.postar("Olá mundo!"); 

        
        String mensagemLonga = "a".repeat(300);
        tw.postar(mensagemLonga); 
    }
}