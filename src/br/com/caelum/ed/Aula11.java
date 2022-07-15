package br.com.caelum.ed;

public class Aula11 {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Lucas", "1234-5678", "lc@email.com");

        vetor.adiciona(c1);

        System.out.println(vetor);

    }
}
