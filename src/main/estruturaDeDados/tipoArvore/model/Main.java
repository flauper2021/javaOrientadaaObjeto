package br.com.javes.estruturaDeDados.tipoArvore.model;

import br.com.javes.estruturaDeDados.tipoArvore.ArvoreBinaria;

public class Main {

    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.add(new Obj(13));
        minhaArvore.add(new Obj(10));
        minhaArvore.add(new Obj(25));
        minhaArvore.add(new Obj(2));
        minhaArvore.add(new Obj(12));
        minhaArvore.add(new Obj(20));
        minhaArvore.add(new Obj(31));
        minhaArvore.add(new Obj(29));

       // minhaArvore.exibirPosOrdem();
       // minhaArvore.exibirPreOrdem();
       // minhaArvore.exibirInOrdem();

        minhaArvore.add(new Obj(32));

        //minhaArvore.exibirPosOrdem();
        //minhaArvore.exibirPreOrdem();
        //minhaArvore.exibirInOrdem();

        minhaArvore.remove(12);

        minhaArvore.exibirPosOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirInOrdem();

    }



}
