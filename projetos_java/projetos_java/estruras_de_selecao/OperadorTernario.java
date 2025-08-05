package estruras_de_selecao;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
public class OperadorTernario {
    public static void main(String[]args){
        var idade = parseInt(showInputDialog("Digite a idade:"));
        // if (idade >= 18)
        // System.out.println("Pode dirigir");
        // else
        // System.out.println("Não pode dirigir");
        var podeDirigir = idade >- 18 ? "Pode dirigir": "Não pode dirigir";
        System.out.println(podeDirigir);
        System.out.println(!(idade >= 18) ? "Sim":"Não");
    }
}
