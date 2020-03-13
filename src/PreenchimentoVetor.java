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
public class PreenchimentoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int[] numero = {3,2,8,7,5,4};
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Na posicao "+i+ " temos o valor "+ numero[i]);
        }
    }
    
}
