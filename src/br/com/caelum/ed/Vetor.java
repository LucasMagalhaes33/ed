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

        return this.alunos[posicao];
    }

    public void remove(int posicao){

    }

    public boolean contem(Aluno aluno){

        for (int i = 0; i < this.totalDeAlunos; i++) {
            if (aluno.equals(this.alunos[i])){
                return true;
            }
        }

        return false;
    }

    public int tamanho(){

        return this.totalDeAlunos;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }

    @Override
    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }

        builder.append(this.alunos[this.totalDeAlunos - 1]);
        builder.append("]");

        return builder.toString();
    }
}
