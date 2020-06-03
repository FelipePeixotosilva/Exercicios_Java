package main;

import java.util.Scanner;

/*******************************************************************************
 * 48) Uma agência de publicidade pediu à agência de modelos Luz & Beleza para
 * encontrar uma modelo que tenha idade entre 18 e 20 anos para participar de
 * uma campanha publicitária milionária de produtos de beleza. Foram inscritas
 * 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações
 * foram armazenadas em 2 vetores distintos. Faça um programa para imprima o
 * vetor que contém os nomes das candidatas aptas a concorrer a uma vaga para
 * a campanha milionária.
 *******************************************************************************/

public class Exercicio6 {

    public static void main(String[] args){
        int quantidade=20;
        int idade [] = new int[quantidade];
        String nome [] = new String[quantidade];
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i < idade.length; i++){
            System.out.println("Digite o nome:");
            nome[i]=entrada.next();
            System.out.println("Digite a idade:");
            idade[i]=entrada.nextInt();
        }
        for(int i=0; i < idade.length;i++){
            if(idade[i]>=18 && idade[i]<=20){
                System.out.println("Nome: "+nome[i]+", idade: "+idade[i]);
            }
        }
    }
}
