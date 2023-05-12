package br.com.javes.estruturaDeDados.tipoArvore;

// cabeçalho.

import br.com.javes.repetidores.Whiles;

public class ArvoreBinaria < T  extends Comparable <T>>{

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

// implementação do metodo add

    public void add(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = add(raiz, novoNo);
    }

    private BinNo<T> add(BinNo<T> atual, BinNo<T> novoNo){
        if(atual== null){
            return novoNo;
        }else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(add(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(add(atual.getNoDir(), novoNo));
        }return atual;
    }

// implementação dos Metodos de execução:

    //Metodo exibirInOrdem:

    public void exibirInOrdem(){
        System.out.print("\n Exibindo inOrdem ");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    //Metodo exibirPosOrdem:

    public void exibirPosOrdem(){
        System.out.print("\n Exibindo posOrdem ");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    // Metodo exibirPreOrdem

    public void exibirPreOrdem(){
        System.out.print("\n Exibindo preOrdem ");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());

        }
    }

    // Implementação do METODO REMOVE

    public void remove(int conteudo){

       try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;

                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }

            }
            if (atual == null) {
                System.out.println(" Conteudo não encontrado. Bloco Try");
            }

            if (pai == null) {

                if (atual.getNoDir() == null) {

                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temp = filho, filho = filho.getNoEsq()
                    )
                        filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }

            }else if (atual.getNoDir() == null) {

                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(atual.getNoEsq());
                    } else {
                        pai.setNoDir(atual.getNoEsq());
                    }

            } else if (atual.getNoEsq() == null) {

                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(atual.getNoDir());
                    } else {
                        pai.setNoDir(atual.getNoDir());
                    }

            } else {

                for (temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                        }
                        filho.setNoDir(atual.getNoDir());

                        if (pai.getNoEsq() == atual) {
                            pai.setNoEsq(filho);
                        } else {
                            pai.setNoDir(filho);
                        }
                    }

                }


       } catch(NullPointerException erro){
            System.out.println("Conteudo não encontrado. Bloco Catch");
       }

    }


}
