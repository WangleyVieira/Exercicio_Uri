/*
 * Escreva um algoritmo que leia uma sequuencia de 30 numeros inteiros, armazene-os em um
 * vetor e mostre quantos elementos sao pares, quantos sao impares e quantos sao negativos.
 */


import java.util.Scanner;

public class VetorParImparNeg {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int contPar = 0, contImpar = 0, contNeg = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o valor %d = ", i + 1);
            vetor[i] = leitor.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(vetor[i] < 0){
                contNeg++;
            }
            else{
                if(vetor[i] % 2 == 0){
                    contPar ++;
                }
                else{
                    contImpar ++;
                }
            }
        }
        System.out.println("Quantidade de elementos Pares: " + contPar);
        System.out.println("Quantidade de elementos Impares: " + contImpar);
        System.out.println("Quantidade de elementos Negativos: " + contNeg);
    }
}
