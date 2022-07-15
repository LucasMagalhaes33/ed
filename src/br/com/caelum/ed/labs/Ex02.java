package br.com.caelum.ed.labs;

import br.com.caelum.ed.Lista;

public class Ex02 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println(lista.ultimoItem("A"));



    }

}
