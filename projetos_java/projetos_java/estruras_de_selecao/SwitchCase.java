
package estruras_de_selecao;
public class SwitchCase{
    public static void main(String[]args){
        var nota = Integer.parseInt(args[0]);
    switch(nota) {
        case 10:
            System.out.println("A");
        case 9:
        System.out.println("B");
        break;
        case 8:
        System.out.println("C");
        break;
        case 7:
        System.out.println("Estudar um pouco mais");

        default:
        System.out.println("Estrudar um pouco mais");
        }
    
    }

}