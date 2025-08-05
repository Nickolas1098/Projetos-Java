
package br.bossini._maua_tti101_t3_sub1_oo_parte2;

public class Personagem {
    String nome;
    private int energia;
    private int fome;
    private int sono;
    
    //sobrecarga de construtores (overload)    
    Personagem(){
        energia = 10;
        fome = 0;
        sono = 0;
    }
    
    Personagem(int e, int f, int s){
        energia = e;
        fome = f;
        sono = s;
    }
    
    //4 partes: tipo de retorno, nome, lista de parâmetros e corpo
    //2 tipos: de efeito colateral e produção de valor
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " caçando");
            energia -= 2; //energia = energia - 2;
        }
        else{
            System.out.println(nome + " sem energia para caçar");
        }
        if(fome < 10)
            fome = fome + 1;
        if(sono < 10)
            sono++;
    }
    
    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo");
            --fome; //fome = fome - 1;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.println(nome + " sem fome");
        }
    }
    
    void dormir(){
        if(sono >= 1){
            System.out.println(nome + " dormindo");
            sono -= 1;
            energia = energia <= 9 ? energia + 1 : energia;
        }
        else{
            System.out.println(nome + " sem sono");
        }
    } 
    int somar(int a, int b){
        return a + b;
    }
    public String toString(){
        return String.format(
        "e: %d, f: %d, s: %d",
        energia, fome,sono
        );
    }
}    
    

