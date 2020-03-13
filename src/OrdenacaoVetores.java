/*
 * Escreva um algoritmo que leia 10 numeros inteiros e ordenos-os em ordem crescente */


import java.util.Scanner;


public class OrdenacaoVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int menor;
        
        System.out.println("================================");
        System.out.println("\tORDENACAO DE VETORES");
        System.out.println("================================");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o valor %d = ", i + 1);
            vetor[i] = leitor.nextInt();
        }
        menor = vetor[0];
        for (int i = 1; i < 10; i++) {
            
        }
    }
}
