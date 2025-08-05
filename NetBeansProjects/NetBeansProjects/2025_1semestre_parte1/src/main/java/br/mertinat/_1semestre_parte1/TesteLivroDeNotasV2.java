package br.mertinat._1semestre_parte1;
public class TesteLivroDeNotasV2 {
    public static void main(String[] args) {     
        var livro = new LivroDeNotas();
        var livro2 = new LivroDeNotas();
        var nomeDisciplina = "POO";
        var outraDisciplina = "LP";
        livro2.nomeDisciplina = outraDisciplina;
        livro.nomeDisciplina = nomeDisciplina;
        livro.exibirMensagem();
        livro2.exibirMensagem();
        System.out.println("Acabou...");
    }
}
