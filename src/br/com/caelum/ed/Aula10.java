package br.com.caelum.ed;

public class Aula10 {

    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Lucas", "1234-4567", "lucas@email.com");
        Contato c2 = new Contato("Pedro", "1234-4567", "pedro@email.com");
        Contato c3 = new Contato("Luiz", "1234-4567", "luiz@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho " + vetor.tamanho());

        System.out.println(vetor);

    }
}
