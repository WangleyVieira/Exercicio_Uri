
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
public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contAno = 0;
        int dias = leitor.nextInt();
        if(dias % 365 == 0 || dias % 365 != 0){
            contAno++;
        }
        System.out.println(contAno + " ano(s)");
    }
}
