package br.com.caelum.ed.labs;

import br.com.caelum.ed.Lista;

public class Ex01 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(3);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("T"));

    }
}
