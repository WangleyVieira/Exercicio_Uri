/*
Crie um programa que calcule o imposto de renda de 27%
integral sobre um determinado salário. Exiba qual o salário
líquido do trabalhador.
 */


import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class ImpostoRendaTrabalhador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario, liquidoTotal = 0, imposto, salarioLiquido;
        
        System.out.print("Informe o seu salario: ");
        salario = leitor.nextDouble();
        
        imposto = (salario - (salario * 0.27));
        
        System.out.println("Salario bruto "+ salario);
        System.out.print("Salario Liquido "+imposto);
        System.out.println("");
    }
    
}
