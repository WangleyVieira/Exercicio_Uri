
import java.util.Scanner;
/* Escolha caso menu de opcoes de uma lanchonete. O arquivo de entrada contém dois valores inteiros 
correspondentes ao código e à quantidade de um item.
*/

public class Lanche {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
            int codigo = leitor.nextInt(); //entrada valor de codigo
            int quantidade = leitor.nextInt(); //entrada valor quantidade
            
            switch (codigo){
                case 1: // Cachorro quente, preco unitario R$ 4,00
                    double cahorro = 4;
                    double result = quantidade * 4;
                    System.out.printf("TOTAL = R$ %.2f\n", result);
                    break;
                case 2: // X-Salada, preco unitário R$ 4,50
                    double salada = 4.50;
                    double result1 = quantidade * 4.50;
                    System.out.printf("TOTAL = R$ %.2f\n", result1);
                    break;
                case 3: //X-Bacon, preco unitário R$ 5,00
                    double bacon = 5;
                    double result2 = quantidade * 5;
                    System.out.printf("TOTAL = R$ %.2f\n", result2);
                    break;
                case 4: // Torrada Simples, preco unitário R$ 2,00
                    double torrada = 2;
                    double result3 = quantidade * 2;
                    System.out.printf("TOTAL = R$ %.2f\n", result3);
                    break;
                case 5: // Refrigerante, preco unitário R$ 1,50
                    double refri = 1.50;
                    double result4 = quantidade * 1.50;
                    System.out.printf("TOTAL = R$ %.2f\n", result4);
                    break;
            }
    }
 
}
