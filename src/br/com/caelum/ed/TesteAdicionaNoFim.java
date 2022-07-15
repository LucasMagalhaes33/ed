package br.com.caelum.ed;

public class TesteAdicionaNoFim {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        VetorObjetos lista = new VetorObjetos(2);

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);
    }

}
