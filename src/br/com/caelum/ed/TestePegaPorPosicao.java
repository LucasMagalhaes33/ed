package br.com.caelum.ed;

public class TestePegaPorPosicao {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        Object aluno1 = lista.pega(0);
        Object aluno2 = lista.pega(2 );

        System.out.println(aluno1);
        System.out.println(aluno2);

    }

}
