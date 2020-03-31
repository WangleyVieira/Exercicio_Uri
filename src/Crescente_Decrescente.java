/*
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para
 * cada X e Y uma mensagem que indeique se estes valores foram digitados em ordem crescente ou
 * decrescente.

 --- ENTRADA
 * A entrada contem varios casos de testes. Cada caso contem dois valores inteiros X e Y. A leitura 
 * deve ser encerrada ao ser fornecido valores iguais para X e Y.
---- SAIDA
 * Para cada caso de teste imrpima "Crescente", caso os valores tenham sido digitados na 
 * ordem crescente, caso contrário imprima uma mensagem "Decrescente"
*/
import java.util.Scanner;


public class Crescente_Decrescente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x, y;
        boolean terminar = false;
        do{
            x = leitor.nextInt();
            y = leitor.nextInt();
            
            if(x == y){
                terminar = true;
            }
            else if(x > y){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
        }
        while(!terminar);
        
        
    }
}
