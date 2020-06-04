package main;

import static java.lang.Math.sqrt;

/*******************************************************************************
 * Escreva um programa que calcule e retorne o valor da hipotenusa através do
 * método HIPOTENUSA. O método recebe o valor da base e da altura de um triângulo
 * Fórmulas: hipotenusa² = base² + altura²
 *             base x altura
 *    área = -----------------
 *                  2
 *******************************************************************************/

public class exercicio9 {
    public static void main(String [] args){

    System.out.print(hipotenusa(5,2)+" cm");
    }

    public static double hipotenusa(double base, double altura){

        double hipotenusa = ((base*base)+(altura*altura));

        hipotenusa=sqrt(hipotenusa);

        return hipotenusa;

    }
}
