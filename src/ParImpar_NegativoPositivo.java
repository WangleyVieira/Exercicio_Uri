
import java.util.Scanner;

/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. 
Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), 
ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá 
imprimir apenas NULL.

 - Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. 
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

 - Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras 
deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
 */

public class ParImpar_NegativoPositivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdTeste = leitor.nextInt();//quantidade de testes
        for (int i = 0; i < qtdTeste; i++) {
            int numeros = leitor.nextInt();//entrada dos valores
            if(numeros < 0 && numeros % 2 == 0){ //negativo e par
                System.out.println("EVEN NEGATIVE");
            }
            else{
                if(numeros < 0 && numeros % 2 != 0){ //negativo e ímpar
                    System.out.println("ODD NEGATIVE");
                }
                else{
                    if(numeros > 0 && numeros % 2 == 0){//positivo e par
                        System.out.println("EVEN POSITIVE");
                    }
                    else{
                        if(numeros > 0 && numeros % 2 != 0){//positivo e impar
                            System.out.println("ODD POSITIVE");
                        }
                        else{
                            System.out.println("NULL");
                        }
                    }
                }
            }
        }
    }
}
