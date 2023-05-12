package br.com.javes.repetidores;

public class If {

    public static void main(String[] args) {

        final var condicao = true;

        if (condicao) {
            System.out.println("\nA condição é verdadeira.\n");
        } else
            System.out.println("A condição é falsa.\n");

        if (condicao) {
            System.out.println("Uma única linha...\n");

            final var ternario = condicao ? "é verdadeira!" : "é falsa!";
            System.out.println(ternario);

        }

    System.out.println("\n FIM DO PROGRAMA!");
    }
}