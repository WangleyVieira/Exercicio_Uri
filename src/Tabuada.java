
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
public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("T A B U A D A ");
        System.out.println("-----------------");
        System.out.print("Informe o numero a ser calculado: ");
        int numero = leitor.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int result;
            result = numero * i;
            System.out.println(numero +" x " + i + " = " + result);
        }
        
    }
}
