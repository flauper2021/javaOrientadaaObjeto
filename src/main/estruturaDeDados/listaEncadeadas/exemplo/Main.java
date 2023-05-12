package br.com.javes.estruturaDeDados.listaEncadeadas.exemplo;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Conteudo 1");
        minhaListaEncadeada.add("Conteudo 2");
        minhaListaEncadeada.add("Conteudo 3");
        minhaListaEncadeada.add("Conteudo 4");
        minhaListaEncadeada.add("Conteudo 5");
        minhaListaEncadeada.add("Conteudo 6");
        minhaListaEncadeada.add("Conteudo 7");
        minhaListaEncadeada.add("Conteudo 8");
        minhaListaEncadeada.add("Conteudo 9");
        minhaListaEncadeada.add("Conteudo 10");

        System.out.println(minhaListaEncadeada.remove(3));
        minhaListaEncadeada.add("conteudo 11");

        System.out.println(minhaListaEncadeada);


    }

}
