package br.com.javes.estruturaDeDados.filas.refatorandoUsandoGenerics;

public class Main {

    public static void main(String[] args) {

        //Fila minhaFila = new Fila();
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        minhaFila.enqueue("quinto");
        minhaFila.enqueue("sexto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.fist());

        System.out.println(minhaFila);

    }

}
