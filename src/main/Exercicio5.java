package main;

import java.util.Scanner;

/*******************************************************************************
 * 47) Considere um vetor de 10 números inteiros positivos maiores que zero e um único número
 * inteiro, também positivo e maior que zero. Faça um programa para:
 * 		a. ler pelo teclado o vetor;
 * 		b. ler pelo teclado o número X;
 * 		c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
 *******************************************************************************/
public class Exercicio5 {
    public static void main(String [] args){
        int vet[];
        vet=new int[10];
        int n=0;
        int cont1=0,cont2=0,cont3=0;
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite 10 numeros inteiros:");
        for(int i=0;i<vet.length;i++){
            vet[i]=numero.nextInt();
        }
        System.out.println("Digite o numero a ser comparado");
        n=numero.nextInt();

        for (int i=0; i<vet.length;i++){

            if(vet[i]<n){
                cont1++;
            }
            else if(vet[i]>n){
                cont2++;
            }
            else if(vet[i]==n){
                cont3++;
            }
        }
        System.out.println("Quatidade de Numeros menores que "+n+" :"+cont1);

        System.out.println("Quantidade de numero maiores que "+n+" :"+cont2);

        System.out.println("Quantidade de numeros iguais a "+n+" :"+cont3);
    }
}
