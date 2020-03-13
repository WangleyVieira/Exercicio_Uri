
import java.util.Scanner;

/*
 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
 * e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A 
 * for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
 */

/**
 *
 * @author Msv Wangley
 */
public class TesteSelecaoI {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        
        int soma1 = c + d;
        int soma2 = a + b;
        
        if((b > c && d > a) && (soma1 > soma2)){
            if((soma1 > 0 && soma2 > 0) && a % 2 == 0){
                System.out.println("Valores aceitos");
            }
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}
