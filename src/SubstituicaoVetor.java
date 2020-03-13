/*
 * Faca um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1.
 * Em seguida mostre o vetor X.

Entrada
 * A entrada contem 10 valores inteiros, podendo ser positivos ou negativos

Saida
 * Para cada posicao do vetor, escreva "X[i] = x ", onde i é a posicao do vetor e x é o valor armazenado naquela posicao
 */


import java.util.Scanner;


public class SubstituicaoVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int[] x = new int[10];
        
        for (int i = 0; i < 10; i++) {
            x[i] = leitor.nextInt();    
           
            if(x[i] <= 0){
                x[i] = 1;
                System.out.println("X["+i+"] = " + x[i]);
            }
            else{
                System.out.println("X["+i+"] = " + x[i]);
            }
            
        }
    }
}
