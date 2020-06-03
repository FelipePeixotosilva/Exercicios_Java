package main;
/*Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que
        * foi realizada a leitura*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String [] args){
        int vet[]=new int [10];

        Scanner numero = new Scanner(System.in);


        System.out.println("Digite 10 numeros:");
        for(int i=0;i<vet.length;i++){

            vet[i]= numero.nextInt();
        }

        for(int i=vet.length-1;i>=0;i--){

            System.out.println(vet[i]);
        }

    }
}
