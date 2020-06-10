package main;

public class Exercicio11 {
    public static void main(String [] args){
        int estacionamento[] = {1,2,3,4,5,6,7};
        int intaux=0;
        int remove=1;
        int aux[]=new int [8];

        //aux[0]=estacionamento[0];

        for(int i=estacionamento.length-1;i>-1;i--){
            if(estacionamento[i]>remove){

                aux[intaux]=estacionamento[i];
                intaux++;
            }
            else{

                for(int j=i;j<estacionamento.length-1;j++){
                    intaux--;
                    estacionamento[j]=aux[intaux];

                }
                for(int x=0;x<estacionamento.length-1;x++){
                    System.out.print(estacionamento[x]);

            }i=-1;//para o loop

        }

        }


    }
}
