/*
 Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
 */


import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class TipoCombustivel {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //int n = leitor.nextInt();
        int gasolina = 0, alcool = 0, diesel = 0, a = 0, i = 0;
        
        while(i != 4) {
                a = leitor.nextInt(); //entrada com os valores do tipo combutivel
                if(a == 1){
                    gasolina ++;
                }
                if(a == 2){
                    alcool ++;
                }
                if(a == 3){
                    diesel ++;
                }
                if(a == 4){
                    break;
                }
            }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Diesel: "+ diesel);
    }
    
}
