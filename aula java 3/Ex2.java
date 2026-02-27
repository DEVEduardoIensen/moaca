import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        double soma =0;

        for(int i = 0; i<3; i++){
            System.out.println("Digite a nota do aluno"+ (i + 1)+":");
            notas[i] = sc.nextDouble();
            soma += notas [i];
        }
        double media = soma / 3;
        System.out.println("Média da turma = " + media);

        sc.close();



    }




}
