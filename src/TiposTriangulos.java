
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
public class TiposTriangulos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        
        if((a + b > c) && (b + c > a) && (a + c > b)){//forma um triangulo
            if((a * a) < (b * b) + (c * c)){//triangulo acutangulo
                System.out.println("TRIANGULO ACUTANGULO");
                if((a == b ) || (b == c) || (a == c)){//triangulo isosceles
                    System.out.println("TRIANGULO ISOSCELES");
                }
                else{
                    if((a == b) && (b == c)){
                        System.out.println("TRIANGULO EQUILATERO");
                    }
                }
            }
            else{//triangulo obtusangulo
                if((a * a) > (b * b) + (c * c)){
                    System.out.println("TRIANGULO OBTUSANGULO");
                    if((a == b) || (b == c) || (a ==c)){
                        System.out.println("TRIANGULO ISOSCELES");
                    }
                }
            }
        }
        else{
            System.out.println("NAO FORMA TRIANGULO");
        }
    }
}
