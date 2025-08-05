import java.util.Scanner;
public class AreaDoCirculo{
    public static void main(String... args){
    double raio;
    Scanner leitor=new Scanner(System.in);
    System.out.println("Digite o valor do raio:");
    raio=leitor.nextDouble();
    double area= Math.PI * Math.pow(raio,2);
    System.out.println("A Area do circulo é "+ area);

    }
  
}