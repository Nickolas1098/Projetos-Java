


package estruras_de_selecao;
import java.util.Scanner;
public class IfESuasVariacoes {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota:");
        nota= leitor.nextDouble();
          
        //if/else aninhado(ninho, nest, nested)
        if( nota >= 9){
            System.out.println("A");
            System.out.println("Parabens!");

        }
        else{
            if ( nota >= 8){
                System.out.println("8");
            }
            else{
                if ( nota >= 7)
                    System.out.println("C");

            }
        
            System.out.println("Estudar um pouco mais");
        }      
    }
}
// if( nota>=6){
//         System.out.println("Aprovado!");
//         System.out.println("Parabens!");
// }
// else{
//     System.out.println("Reprovado!");
//     System.out.println("Estudar mais!");
// }    







  //if/else encadeado
    //     if( nota >= 9){
    //         System.out.println("A");
    //         System.out.println("Parabens!");
    //     }
    //     else if ( nota >= 8)
    //      System.out.println("B");
    //      else if ( nota >= 7)
    //      System.out.println("C");
    //      else 
    //      System.out.println("R");
        
    //     System.out.println("Progarma acabando aqui...");

