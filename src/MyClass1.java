
import java.util.Scanner;


public class MyClass1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        double salario = leitor.nextDouble();
        double totalVendas = leitor.nextDouble();
        
        double result = ((totalVendas * 15) / 100) + salario;
        
        System.out.printf("TOTAL = R$ %.2f\n", result);
        
    }
}
