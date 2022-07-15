package br.com.caelum.ed;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        ArrayList vetor = new ArrayList<>();
        ArrayList vetorSemGenerics = new ArrayList<>();
        ArrayList<Aluno> vetorComGenerics = new ArrayList<>();

        Aluno aluno = new Aluno();

        vetorSemGenerics.add(aluno);
        vetorComGenerics.add(aluno);

        Aluno a1 = (Aluno) vetorSemGenerics.get(0);
        Aluno a2 = vetorComGenerics.get(0);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        vetor.add(aluno1);
        vetor.add(aluno2);
        vetor.add(0, aluno3);

        int tamanho = vetor.size();

        if (tamanho != 3 ){
            System.out.println("Erro: O tamanho da lista está errado");
        }

        if (!vetor.contains(aluno1)){
            System.out.println("Erro não achou um aluno que deveria estar na lista");
        }

        vetor.remove(0);
        tamanho = vetor.size();

        if (tamanho != 2){
            System.out.println("Erro: o tamanho da lista está errado.");
        }

        if (vetor.contains(aluno3)){
            System.out.println("Erro: achou um aluno que não deveria estar na lista");
        }

    }

}
