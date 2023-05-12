package br.com.javes.estruturaDeDados.listaCircular.exemplo;

public class Main {

    public static void main (String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("C-0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("C-01");
        minhaListaCircular.add("C-02");
        minhaListaCircular.add("C-03");
        minhaListaCircular.add("C-04");
        minhaListaCircular.add("C-05");
        minhaListaCircular.add("C-06");
        minhaListaCircular.add("C-07");
        minhaListaCircular.add("C-08");

        System.out.println(minhaListaCircular);

        minhaListaCircular.remove( 4);
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(2));

        for(int i = 0; i < 14; i++){
            System.out.println(minhaListaCircular.get(i));

        }


    }
}
