package EstruturasDeRepeticao;

public class Fatorial {
    public static void main(String[] args){
        int n= 5;
        int fat= 1;
        int cont= 1;
        while(cont <= n){
            fat = fat * cont;
            cont++;

        }
        System.out.println(fat);
    }
    
}
