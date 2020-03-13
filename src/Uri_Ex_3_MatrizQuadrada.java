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
public class Uri_Ex_3_MatrizQuadrada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        boolean terminar = false;
        
        while(terminar == false){
            int n = leitor.nextInt();
            if(n == 0){
                terminar = true; //encerra a execucao do while
            }
            int[][] matrizM = new int[n][n];
            for (int i = 0; i < matrizM.length; i++) {//linha
                for (int j = 0; j < matrizM.length; j++) {//coluna
                    matrizM[i][j] = 1;
                    if(n == 3 && i == 1 && j == 1){
                        matrizM[i][j] = 2;
                    }
                    if(n == 4){
                        for (int k = 1; k <= 2; k++) {
                            for (int l = 1; l <= 2; l++) {
                                matrizM[k][l] = 2;
                            }
                        }
                    }
                    if(n == 5){
                        for (int k = 1; k <= 3; k++) {
                            for (int l = 1; l <= 3; l++) {
                                matrizM[k][l] = 2;
                                if(k == 2 && l == 2){
                                    matrizM[k][l] = 3;
                                }
                            }
                        }
                    }   
                }
            }
            System.out.println("");
            for (int i = 0; i < matrizM.length; i++) {
                for (int j = 0; j < matrizM.length; j++) {
                    System.out.print(matrizM[i][j]+"   "); 
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
    }
}
