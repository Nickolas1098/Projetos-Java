import javax.swing.JOptionPane;
public class SomaDoisNumerosGUI{
    static public void main(String[] args){
        //declaracao de variaveis
        double primeiroOperando,segundoOperando,resultado;
        //entrada
       primeiroOperando= Double.parseDouble(
            JOptionPane.showInputDialog("Primeiro valor")
        ); 
        segundoOperando= Double.parseDouble(
            JOptionPane.showInputDialog("Segundo valor")
        );
        //processamento
        resultado= primeiroOperando + segundoOperando;
        //saida
        JOptionPane.showMessageDialog(null,"Resultado:" + resultado);
    }
}