package br.com.caelum.ed;

public class TesteTamanhoLista {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Rafael");
        a1.setNome("Paulo");

        VetorObjetos lista = new VetorObjetos(3);

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista.tamanho());

        lista.adiciona(a3);

        System.out.println(lista.tamanho());

    }

}
