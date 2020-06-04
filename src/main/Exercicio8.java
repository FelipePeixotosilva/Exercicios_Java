package main;
/*******************************************************************************
 * 61) Escreva um programa que calcule e retorne o salário atualizado através do
 * método REAJUSTE. O método deve receber o valor do salário e o índice de
 * reajuste.
 *******************************************************************************/
public class Exercicio8 {

    public static void main(String [] args){

        System.out.print(reajuste(10,0.3));

    }
    public static double reajuste(double salario, double indice){
        double reajuste= salario * indice;
        return salario + reajuste;
    }
}
