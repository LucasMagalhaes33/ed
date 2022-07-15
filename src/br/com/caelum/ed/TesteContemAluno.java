package br.com.caelum.ed;

public class TesteContemAluno {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        VetorObjetos lista = new VetorObjetos(2);

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista.busca(a1));
        System.out.println(lista.busca(a2));

        Aluno aluno = new Aluno();
        aluno.setNome("Ana");

        System.out.println(lista.busca(aluno));

    }

}
