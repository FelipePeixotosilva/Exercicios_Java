package main;

/*******************************************************************************
 * 60) Escreva um programa que retorne o número do quadrante (1,2,3 ou 4) através
 * de um método chamado VERIFICA_QUADRANTE, que deve receber um valor para x e um
 *	valor para y.
 Quadrantes
 *         x |
 *           |
 *     2o    |     1o
 *           |
 *y ----------------------
 *           |
 *           |
 *     3o    |     4o
 *           |
 *******************************************************************************/
public class Exercicio7 {
    public static void main(String [] args){

        System.out.println("Quadrante : "+verificaQuadrante(-5,-9));
    }

    public static int verificaQuadrante(double x, double y){
        int quadrante = 0;
        if( x >= 0){
            quadrante = ( y >= 0 ? 1 : 2) ;
        }
        else if(x<=0){
            quadrante = (y <= 0 ? 3 : 4);
        }
        return quadrante;
    }
}
