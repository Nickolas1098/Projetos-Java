package EstruturasDeRepeticao;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
public class EstruturasDeRepeticao {
   
    public static void main(String[]args){
        //estrutura de repetição controlada por contador
      double nota1, nota2, media;
      int cont=1;
      while(cont <=5){
        do{
            nota1= parseDouble(showInputDialog("Digite a nota 1 entre 0 a 10:"));

            
        }while(nota1 <0 || nota1 > 10)
        
        do{
            nota2= parseDouble(showInputDialog("Digite a nota 2 entre o a 10:"));

      }while(!(nota2 >= 0 || nota2 <= 10))
        media= (nota1 + nota2)/2;
        showMessageDialog(
            null,
            media >= 6 ? "Aprovado":"Reprovado"
        );
        
        cont++;

      }
    }
}

      
      // int cont= 1;
      // while(cont <= 3){
        //     double nota1,nota2,media;
        //     nota1= parseDouble(showInputDialog("Digite a nota 1:"));
        //     nota2= parseDouble(showInputDialog("Digite a nota 2:"));
        //     media= (nota1 + nota2)/2;
        //     if( media >=6)
        //     showMessageDialog(null, "Aprovado!");
        //     else
        //     showMessageDialog(null, "Reprovado!");
        //     cont=cont + 1;
        // }
        //}
        
        
        //     int cont= 1;
        //   while(true){
            //         double nota1,nota2,media;
            //         nota1= parseDouble(showInputDialog("Digite a nota 1:"));
            //         nota2= parseDouble(showInputDialog("Digite a nota 2:"));
            //         media= (nota1 + nota2)/2;
            //         if( media >=6)
            //         showMessageDialog(null, "Aprovado!");
            //         else
            //         showMessageDialog(null, "Reprovado!");
            //         cont= cont + 1;
            //         if(cont > 3)
            //         break;
            //     }
            //       int cont= 1;
            //       do{
            //           System.out.println(cont);
            //           cont++;
            
            //       }while(cont <= 3);
            //         System.out.println(cont);
            //     }
                
            // }