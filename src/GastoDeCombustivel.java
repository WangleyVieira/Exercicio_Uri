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
public class GastoDeCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double tempo = leitor.nextDouble();
        double velocidade = leitor.nextDouble();
        
        double result = (double)(velocidade / 12) * tempo;
        
        System.out.printf("%.3f\n",result);
    }
    
}
