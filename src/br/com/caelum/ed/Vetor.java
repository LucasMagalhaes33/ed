package br.com.caelum.ed;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno){
            this.alunos[this.totalDeAlunos] = aluno;
            this.totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno){

    }

    public Aluno pega(int posicao){
        return null;
    }

    public void remove(int posicao){

    }

    public boolean contem(Aluno aluno){
        return false;
    }

    public int tamanho(){
        return 0;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "alunos=" + Arrays.toString(alunos) +
                '}';
    }
}
