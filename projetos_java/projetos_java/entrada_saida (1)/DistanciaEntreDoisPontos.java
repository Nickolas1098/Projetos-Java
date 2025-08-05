//indentando(indent)
import java.util.Scanner;
public class DistanciaEntreDoisPontos{
    static public void main(String...args){
        //declaração de variáveis
        //float(4 bytes),double(8 bytes)
        float x1,x2,y1,y2;
        float distancia;
        Scanner leitor= new Scanner(System.in);
        //entrada
        System.out.println("Digite x1");
        x1=leitor.nextFloat();
        System.out.println("Digite x2");
        x2=leitor.nextFloat();
        System.out.println("Digite y1");
        y1=leitor.nextFloat();
        System.out.println("Digite y2");
        y2=leitor.nextFloat();

        //processamento
        distancia=(float)(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
        //distancia=(float)(math.pow(x2-x1,2) + math.pow(y2-y1,2));
        //distancia=(float)(math.sqrt(distancia));

        //saida
        System.out.println("Distancia: "+ distancia);

    }

}