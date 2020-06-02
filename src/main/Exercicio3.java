package main;
/* 28) Faça um programa que gera e escreve os números ímpares dos números lidos
        * entre 100 e 200.*/

public class Exercicio3 {
    public static void main(String [] args){
    System.out.println("Numeros impares entre 100 e 200:");
    for(int i = 200;i>100;i--){
        if(i%2==1){
            System.out.println(i);
        }
    }
    }
}
