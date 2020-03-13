
import java.util.Scanner;


public class NumeroPerfeito {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroTestes = leitor.nextInt();//informa a quantidade de testes

        for (int i = 0; i < numeroTestes; i++) {
            int numero = leitor.nextInt();//valores de entrada
            int soma = 0;
            for (int j = 1; j < numero; j++) {//encontrar os divisores de numero
                if(numero % j == 0){
                    soma += j;
                }
            }
            if(soma == numero){
                System.out.println(numero+" eh perfeito");
            }
            else{
                System.out.println(numero+" nao eh perfeito");
            }
            
        }
    }
    
}
