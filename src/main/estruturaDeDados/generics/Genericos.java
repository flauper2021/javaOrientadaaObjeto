package br.com.javes.estruturaDeDados.generics;

import java.util.List;
// metodo para criação de uma lista generica, lembrando que essas
// listas são invariaveis, isto é, não recebe listas de outro tipo

public class Genericos {

    Lista<String> minhaLista = new Lista<>();

    public class Lista<T> {
        private T t;



    }
}


//Upper Bounded Wildcard ou extends Wildcard

