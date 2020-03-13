
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();
        double n3 = leitor.nextDouble();
        double n4 = leitor.nextDouble();
        double mediaAluno = (2*n1 + 3*n2 + 4*n3 + 1*n4) / (2+3+4+1);
        
        if(mediaAluno < 5){
            System.out.printf("Media: %.1f\n", mediaAluno);
            System.out.println("Aluno reprovado.");
        }
        else{
            if(mediaAluno >= 5 && mediaAluno <= 6.9){
                double notaExame = leitor.nextDouble();
                double resultadoFinal = (mediaAluno + notaExame) / 2;
                if(resultadoFinal >= 5 && resultadoFinal < 7){
                    System.out.printf("Media: %.1f\n", mediaAluno);
                    System.out.println("Aluno em exame.");
                    System.out.printf("Nota do exame: %.1f\n", notaExame);
                    System.out.println("Aluno aprovado.");
                    System.out.printf("Media final: %.1f\n", resultadoFinal);
                }
                else{
                    System.out.printf("Media: %.1f\n", mediaAluno);
                    System.out.println("Aluno em exame.");
                    System.out.printf("Nota do exame: %.1f\n", notaExame);
                    System.out.println("Aluno reprovado.");
                    System.out.printf("Media final: %.1f\n", resultadoFinal);
                }
            }
            else{
                if(mediaAluno >= 7){
                    System.out.printf("Media: %.1f\n", mediaAluno);
                    System.out.println("Aluno aprovado.");
                }
            }
        }
    }
}
