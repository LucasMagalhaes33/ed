package br.com.caelum.ed;

import java.util.Arrays;

public class Vetor {

    private Object[] objetos = new Object[100];
    private int totalObjetos = 0;

    public void adiciona(Object objeto){
            this.garantaEspaco();
            this.objetos[this.totalObjetos] = objeto;
            this.totalObjetos++;
    }

    public void adiciona(int posicao, Aluno aluno){
        this.garantaEspaco();

        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao inválida");
        }

        for (int i = this.totalObjetos - 1; i >= posicao; i--){
            this.objetos[i + 1] = this.objetos[i];
        }

        this.objetos[posicao] = aluno;
        this.totalObjetos++;
    }

    public Object pega(int posicao){

        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }

        return this.objetos[posicao];

    }

    public void remove(int posicao){
        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao invalida");
        }

        for (int i = posicao; i < this.totalObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i+1];
        }

        this.totalObjetos--;

    }

    public boolean contem(Aluno aluno){

        for (int i = 0; i < this.totalObjetos; i++) {
            if (aluno.equals(this.objetos[i])){
                return true;
            }
        }

        return false;
    }

    public int tamanho(){

        return this.totalObjetos;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalObjetos;
    }

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <=this.totalObjetos;
    }

    private void garantaEspaco(){
        if (this.totalObjetos == this.objetos.length){
            Object[] novaArray = new Aluno[this.objetos.length * 2];
            for (int i = 0; i < this.objetos.length; i++) {
                novaArray[i] = this.objetos[i];
            }
            this.objetos = novaArray;
        }
    }

    @Override
    public String toString() {
        if (this.totalObjetos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.totalObjetos - 1; i++) {
            builder.append(this.objetos[i]);
            builder.append(", ");
        }

        builder.append(this.objetos[this.totalObjetos - 1]);
        builder.append("]");

        return builder.toString();
    }
}
