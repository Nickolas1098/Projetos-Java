import Java.util.Scanner;
public class SomaDoisNumeros{
    public static void main(String[]args){
        //declaracao de variaveis
        Scanner leitor=new Scanner(System.in);
        int primeiroOperando,segundoOperando;
        int resultado;
        //entrada
        System.out.println("Digite o primeiro operando");
        primeiroOperando=leitor.nextint();
        System.out.println("Digite o segundo operando");
        segundoOperando=leitor.nextint();
        //processamento
        resultado= primeiroOperando + segundoOperando;
        //saida
        System.out.println("Resultado:"+ resultado);
    }
}
