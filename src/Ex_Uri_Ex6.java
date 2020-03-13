/*
 * Bino e Cino sao colegas inseparaveis. Bino gosta de criar desafios matematicos para Cino resolveer.
 * Desta vez, Bino gerou uma lista de numeros e perguntou ao Cino quantos numeros da lista sao multiplos
 * de 2, 3, 4 e 5.
 * Esse deseafio pode parecer simples, porem quando a lista contem muitos numeros, Cino se confunde e acava 
 * errando alguns calculos. Para ajudar Cino, faca um programa para resolver o desafio de Bino.
 *-- Entrada
 * A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números
 * na lista de Bino.
 * --Saída
 * Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. Observe a formatação da saída nos 
 * exemplos, pois ela deve ser seguida rigorosamente.
 */


import java.util.Scanner;

public class Ex_Uri_Ex6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int qtdElementos = leitor.nextInt();
        int[] vetor = new int[qtdElementos];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        int cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            if(2 * i == vetor[i] || vetor[i] % 2 == 0){
                cont2++;
            }
            if(3 * i == vetor[i] || vetor[i] % 3 == 0){
                cont3++;
            }
            if(4 * i == vetor[i] || vetor[i] % 4 == 0){
                cont4++;
            }
            if(5 * i == vetor[i] || vetor[i] % 5 == 0){
                cont5++;
            }
        }
        System.out.println(cont2+" Multiplo(s) de 2");
        System.out.println(cont3+" Multiplo(s) de 3");
        System.out.println(cont4+" Multiplo(s) de 4");
        System.out.println(cont5+" Multiplo(s) de 5");
    }
    
}

