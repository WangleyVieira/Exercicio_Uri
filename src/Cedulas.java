/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


public class Cedulas {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int numero = leitor.nextInt();
        
        int cont100 = 0, cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0,
                cont2 = 0, cont1 = 0;
        
       if(numero > 0 && numero < 1000000){
           cont100 = (int)(numero / 100);
           cont50 = (int)((numero % 100) / 50);
           cont20 = (int)(((numero % 100) % 50) / 20);
           cont10 = (int)((((numero % 100) % 50) % 20) / 10);
           cont5 = (int)(((((numero % 100) % 50) % 20) % 10) / 5);
           cont2 = (int)((((((numero % 100) % 50) % 20) % 10) % 5) / 2);
           cont1 = (int)((((((numero % 100) % 50) % 20) % 10) % 5) % 2);
           
           System.out.println(cont100 +" nota(s) de R$ 100,00");
           System.out.println(cont50 +" nota(s) de R$ 50,00");
           System.out.println(cont20 + " nota(s) de R$ 20,00");
           System.out.println(cont10 +" nota(s) de R$ 10,00");
           System.out.println(cont5 + " nota(s) de R$ 5,00");
           System.out.println(cont2 +" nota(s) de R$ 2,00");
           System.out.println(cont1 +" nota(s) de R$ 1,00");
       }    
    }
    
}
