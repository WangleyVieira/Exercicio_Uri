/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] vet = new double[5];
        double nota1, nota2, nota3, soma = 0;
        double media;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a nota "+i+ " : ");
            vet[i] = leitor.nextDouble();
            
            soma += vet[i];
        }
        media = soma / 5;
        if(media >= 7){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Auno reprovado");
        }
        System.out.println("Soma das notas "+soma);
        System.out.printf("A Média do aluno é %.2f \n", media);
    }
    
}
