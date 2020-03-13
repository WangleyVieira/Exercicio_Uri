/*
 * Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc.,
 * até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
 * A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.
 */


import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class TrocaVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int[] n = new int[20];
       int[] aux = new int[20]; 
        
        for (int i = 0; i < 20; i++) {
            n[i] = leitor.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            aux[i] = n[19 - i];
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("N["+i+"] = " + aux[i]);
        }
    }
}
