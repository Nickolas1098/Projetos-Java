package EstruraDeRepeticao;
import java.util.Scanner;
public class MenuOperacoesAritmeticas {
    public static void main(String[]args){
        String menu= " 1- Soma\n 2- Subtração\n 3- Multiplicação\n 4- Divisão\n 5- Sair ";
        var leitor = new Scanner(System.in);
        int opcao;
        double operando1,operando2,resultado;
        do{
            System.out.println(menu);
            opcao= leitor.nextInt();
            if (opcao < 1 || opcao >5){
                System.out.println("Opção inválida");
            }
            else if(opcao != 5){
                System.out.println("Digite o primeiro operando:");
                operando1= leitor.nextInt();
                System.out.println("Digite o segundo operando:");
                operando2= leitor.nextInt();
                switch(opcao){
                    case 1:
                        resultado= operando1 + operando2;
                        //Primeiro modo de fazer o calculo com printf
                        System.out.printf( 
                           " %.2f + %.2f = %.2f\n",
                           operando1, operando2, resultado
                        );
                        break;
                    case 2:
                        resultado= operando1 - operando2;
                        //Segundo modo de fazer o calculo com prinln
                        System.out.println(
                            operando1 + "-" + operando2 + "=" + resultado
                        );
                        break;
                    case 3:
                        resultado=operando1 * operando2;
                        //Terceiro modo de fazer o calculo com print apenas
                        System.out.print(
                            String.format(
                               " %.2f * %.2f = %.2f\n",
                                operando1,operando2,resultado
                            )
                        );
                        break;
                    case 4:
                        resultado= operando1 / operando2;
                        System.out.print(
                            operando1 + "/" + operando2 + "=" + resultado + "\n"
                        );
                        break;
                    case 5:
                        System.out.println("Até logo");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }

            }
            else{
                System.out.println("Até");
            }
            
        }while(opcao != 5);
        

    }
}
