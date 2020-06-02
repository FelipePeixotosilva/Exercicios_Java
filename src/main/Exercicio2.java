package main;

import java.util.Scanner;

/*******************************************************************************
 * 27) Escreva um programa que leia:
 *   - a quantidade de números que deverá processar;
 *   - os números que deverá processar,e calcule e exiba, para cada número a ser
 *     processado o seu fatorial.
 * Lembrete: O fatorial de um número N é dado pela fórmula:
 *     N! = 1 * 2 * 3 * 4 * 5 * ... * N
 *******************************************************************************/

public class Exercicio2 {
    public static void main(String [] args){

        int quantidadeNumeros;
        int fatorial;
        Scanner numero = new Scanner(System.in);
        int aux;
        System.out.println("Digite o fatorial:");
        quantidadeNumeros=numero.nextInt();

        fatorial=quantidadeNumeros;

        for(int i=quantidadeNumeros; i>1; i--){

            fatorial=fatorial*(i-1);

            System.out.print(i);
            if(i>2){
                System.out.print("*");
            }
            else {
                System.out.print("*1=");

            }
            }
        System.out.println(fatorial);



    }
}
