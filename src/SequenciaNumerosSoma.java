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
public class SequenciaNumerosSoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int m = leitor.nextInt();
        int n = leitor.nextInt();
        int soma = 0, aux = 0;
        
        while(m > 0 && n > 0){
            if(m < n){//caso m seja menor que n os valores são trocados
                aux = m;
                m = n;
                n = aux;
            }
            for (int i = n; i <= m; i++) {
                soma += i;
                System.out.print(i + " ");
            }
            System.out.printf("Sum=%d\n", soma);
            m = leitor.nextInt();//encerra o caso seja menor ou igual que zero e a valor ja foi declarado acima
            n = leitor.nextInt();//encerra o caso seja menor ou igual que zero
            
            //soma = 0;
        }
    }
    
}
