package br.com.javes.estruturaDeDados.listaCircular.exemplo;

//criação da base da classe Lista Circular:

public class ListaCircular <T> {

    private No <T> cabeça;
    private No <T> cauda;
    private int tamanhoLista;

//criação do construtor da classe Lista Circular:

    public ListaCircular(){

        this.cabeça = null;
        this.cauda = null;
        this.tamanhoLista = 0;

    }

//implementação do metodo isEmpty e size:

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

// implementação do metodo get e getNo:

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){

        if (this.isEmpty()){
            throw new IndexOutOfBoundsException(" A lista esta vazia");
        }

        if(index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;

        for (int i = 0; i < index; i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;

    }

// implementação do metodo add:

    public void add(T conteudo){
        No <T> novoNo = new No<>(conteudo);

        if(this.tamanhoLista == 0){

            this.cabeça = novoNo;
            this.cauda = this.cabeça;
            this.cabeça.setNoProximo(cauda);

        }else{

            novoNo.setNoProximo(this.cauda);
            this.cabeça.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

// implementação do metodo remove:

    public void remove(int index){

        if(index >= this.tamanhoLista){
            throw new IndexOutOfBoundsException(" O indice pedido é maior que a Lista!");
        }

        No<T> noAuxiliar = cauda;

        if (index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeça.setNoProximo(this.cauda);

        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());

        }else{

            for(int i = 0; i< index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

// implemantação do metodo toString:

    @Override
    public String toString(){
     No<T> noAuxiliar = this.cauda;
     String strRetorno =  "";

     for(int i = 0; i < size(); i++){
         strRetorno += "[No { conteudo = " + noAuxiliar.getConteudo() + " }] --->\n";
         noAuxiliar = noAuxiliar.getNoProximo();
     }
     strRetorno += this.size() != 0 ? ("Retorna ao inicio!") : ("[]");
     return strRetorno;

    }

}