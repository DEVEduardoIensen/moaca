package lista2;



import java.util.ArrayList;


class Unidade {
    public void mover() {
        System.out.println("Movendo...");
    }

    public void atacar() {
        System.out.println("Atacando...");
    }
}


class Arqueiro extends Unidade {
    public void mover() {
        System.out.println("Arqueiro move 1 casa");
    }

    public void atacar() {
        System.out.println("Arqueiro ataca a distância");
    }
}


class Cavaleiro extends Unidade {
    public void mover() {
        System.out.println("Cavaleiro move 3 casas");
    }

    public void atacar() {
        System.out.println("Cavaleiro ataca corpo a corpo");
    }
}


class Torre extends Unidade {
    public void mover() {
        System.out.println("Torre não pode mover"); 
    }

    public void atacar() {
        System.out.println("Torre ataca com canhão");
    }
}

public class Ex09 {
    public static void main(String[] args) {

        
        ArrayList<Unidade> exercito = new ArrayList<Unidade>();

        exercito.add(new Arqueiro());
        exercito.add(new Cavaleiro());
        exercito.add(new Torre());

        
        for (Unidade u : exercito) {
            u.mover();
            u.atacar();
            System.out.println("---");
        }
    }
}
