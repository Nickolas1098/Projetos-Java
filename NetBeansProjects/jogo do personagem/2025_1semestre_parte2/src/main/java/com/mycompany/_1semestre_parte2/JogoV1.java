
package br.bossini._maua_tti101_t3_sub1_oo_parte2;
import java.util.Random;
public class JogoV1 {
    public static void main(String[] args) throws Exception {
        
        var gerador = new Random();
        int valor = gerador.nextInt(10); //0, 9
        //10, 0, 0
        var p = new Personagem();
//        p.energia = 500;
        var p2 = new Personagem(2, 5, 9);
        p2.nome = "Snorlax";
        p.nome = "Jose";
        while(true){
            var atividadeJose = 1 + gerador.nextInt(3);
            switch(atividadeJose){
                case 1:
                    p.cacar();
                    break;
                case 2: 
                    p.comer();
                    break;
                case 3:
                    p.dormir();
                    break;

            }
            System.out.println(p);
            var atividadeSnorlax = gerador.nextDouble();
            if(atividadeSnorlax <= 0.6){
                p2.dormir();
            }
            else if(atividadeSnorlax <= 8){
                p2.comer();
            }
            else{
                p2.cacar();
            }
            System.out.println(p2);
            System.out.println("**********");
            Thread.sleep(5000);
        }
    }
}
