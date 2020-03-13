/*
 * Escreva um algrotimo que receba de entrada 20 valores inteiros, e mostre a soma dos 
 *elementos pares e impares
 */


import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class VetoresSomaImparesPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int[] numero = new int[20];
        int somaPar = 0, somaImpar = 0;
        System.out.println("-----------------------");
        System.out.println("Informe os valores:");
        System.out.println("-----------------------");
        for (int i = 0; i < 20; i++) {
            numero[i] = leitor.nextInt();
            
            if(numero[i] % 2 == 0){
                somaPar += numero[i];
            }
            else{
                somaImpar += numero[i];
            }
            
        }
        System.out.println("Soma dos elementos impares do vetor: " + somaImpar);
        System.out.println("Soma dos elementos pares do vetor: " + somaPar);
        
    }
    
}
