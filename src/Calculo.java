
import java.util.Scanner;


public class Calculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int codigo = leitor.nextInt(); int num = leitor.nextInt(); double preco = leitor.nextDouble();
        int codigo2 = leitor.nextInt(); int num2 = leitor.nextInt(); double preco2 = leitor.nextDouble();
        
        double result = (num * preco) + (num2 + preco2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", result);
    }
}
