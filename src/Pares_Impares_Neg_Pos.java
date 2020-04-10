
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Msv Wangley
 */
public class Pares_Impares_Neg_Pos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int numero, contNeg = 0, contPos = 0, contPar = 0, contImp = 0;
        
        for (int i = 0; i < 5; i++) {
            numero = leitor.nextInt();
            
            if(numero > 0){
                contPos++;
            }
            else if(numero < 0){
                contNeg++;
            }
            
            if(numero % 2 == 0){
                contPar++;
            }
            else{
                contImp++;
            }
        }
        
        System.out.println(contPar+" valor(es) par(es)");
        System.out.println(contImp+" valor(es) impar(es)");
        System.out.println(contPos+" valor(es) positivo(s)");
        System.out.println(contNeg+" valor(es) negativo(s)");
    }
}
