package lista2;




class Operacao {
    public double executar(double a, double b) {
        return 0; 
    }
}


class Soma extends Operacao {
    public double executar(double a, double b) {
        return a + b;
    }
}


class Divisao extends Operacao {
    public double executar(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }
}


class Exponenciacao extends Operacao {
    public double executar(double a, double b) {
        
        double resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = resultado * a;
        }
        return resultado;
    }
}

public class Ex03 {
    public static void main(String[] args) {


        Operacao op1 = new Soma();
        Operacao op2 = new Divisao();
        Operacao op3 = new Exponenciacao();

        System.out.println("Soma 5 + 3 = " + op1.executar(5, 3));
        System.out.println("Divisão 10 / 2 = " + op2.executar(10, 2));
        System.out.println("2 elevado a 8 = " + op3.executar(2, 8));
    }
}
