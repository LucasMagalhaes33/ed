package br.com.caelum.ed;

public class TestePegaPorPosicao {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        VetorObjetos lista = new VetorObjetos(3);

        lista.adiciona(a1);
        lista.adiciona(a2);

        Object aluno1 = lista.busca(0);
        Object aluno2 = lista.busca(2 );

        System.out.println(aluno1);
        System.out.println(aluno2);

    }

}
