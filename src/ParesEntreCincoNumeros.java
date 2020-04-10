
import java.util.Scanner;


public class ParesEntreCincoNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int i = 0, numero, contPar = 0;
        while(i < 5){
            numero = leitor.nextInt();
            if(numero % 2 == 0){
                contPar++;
            }
            i++;
        }
        System.out.println(contPar+" valores pares");
    }
}
