package main;
/*
 classe Pessoa
 -nome
 -idade
 -sexo
 +fazerAniver

 Classe Livro
 -titulo
 -autor
 totPaginas
 -pagAtual
 -aberto
 -leitor
 +detalhes()

 interface Publicacao
 +abrir()
 +fechar()
 +folhear()
 +avancarPag()
 +voltarPag()
 */

public class Exercicio10 {
    public static void main(String [] args){

    }
}

class Pessoa{
String nome;
int    idade=0;
String sexo;

public Pessoa(String nome, int idade, String sexo){
    this.nome=nome;
    this.idade=idade;
    this.sexo=sexo;

}

public int fazerAniver(){
    return idade++;
}
}

class Livro  implements publicacao{
    String titulo;
    String autor;
    int    pagAtual;
    boolean aberto;

public void detalhes(){
    System.out.print(titulo+" "+autor+" "+pagAtual+" "+aberto);
}

    @Override
    public boolean abrir() {
        return false;
    }

    @Override
    public boolean fechar() {
        return false;
    }

    @Override
    public int follear() {
        return 0;
    }

    @Override
    public int avancarPag() {
        return 0;
    }

    @Override
    public int voltarPag() {
        return 0;
    }
}

interface publicacao{
   public boolean abrir();
   public boolean fechar();
   public int     follear();
   public int     avancarPag();
   public int     voltarPag();
}