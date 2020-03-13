
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
public class FormulaBhaskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        
        double formula = Math.sqrt(b) - 4 * a * c; //formula de Bhaskara e b elevado ao quadrado
        
        double x1 = (- b + Math.sqrt(formula)) / (2 * a); //valor de x1 (Math.sqrt) extraia raiz
        double x2 = (- b - Math.sqrt(formula)) / (2 * a); //valor de x2
        
        if((x1  == 0 && x2 == 0) || (x1 < 0 && x2 < 0)){
              System.out.println("Impossivel calcular");
        }
        else{
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
        //System.out.printf("R1 = %.5f\n", x1);
        //System.out.printf("R2 = %.5f\n", x2);
        
    }
}
