package lista2;

class Instrumento {
    public void tocar() {
        System.out.println("Tocando...");
    }
}


class Violao extends Instrumento {
    
    public void tocar() {
        System.out.println("Acorde de Dó Maior");
    }
}


class Bateria extends Instrumento {
    
    public void tocar() {
        System.out.println("Tum pá tum tum pá");
    }
}

public class Ex01 {
    public static void main(String[] args) {

        
        Instrumento i1 = new Violao();
        Instrumento i2 = new Bateria();

        i1.tocar();
        i2.tocar(); 
    }
}