
import java.util.Scanner;


public class Index12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double salario = leitor.nextDouble();
        
        if(salario <= 2000){
            System.out.println("Isento");
        }
        else{
            if(salario >= 2000.01 && salario <= 3000){
                double result = 0.08 * (salario - 1000);
                System.out.printf("R$ %.2f\n", result);
            }
            else{
                if(salario >= 3000.01 && salario <= 4500){
                    double result = 0.18 * (salario - 1000);
                    System.out.printf("R$ %.2f\n", result);
                }
                else{
                        double result = 0.28 * (salario - 1000);
                        System.out.printf("R$ %.2f\n", result);
                }
            }
        }
    }
}
