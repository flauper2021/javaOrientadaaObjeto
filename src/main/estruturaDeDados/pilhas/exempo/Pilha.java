package br.com.javes.estruturaDeDados.pilhas.exempo;

public class Pilha {

    private No refNoEntrada;

    public Pilha(){
        this.refNoEntrada = null;
    }

    public No top(){
        return refNoEntrada;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped =refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNo();
            return noPoped;
        }
        return null;

    }

    public boolean isEmpty(){
        if(refNoEntrada == null){
            return true;
        }return false;

    }
    @Override
    public String toString(){

        String stringRetorno = "\n\n----------------INICIO DO PROGRAMA_______________\n";
                stringRetorno += "                   Pilha\n";
                stringRetorno +="------------------------------------------------\n";

        No noAuxiliar = refNoEntrada;

        while(true){
            if(noAuxiliar != null){
               stringRetorno += "[No{dado= " +noAuxiliar.getDado()+"}]\n";
               noAuxiliar = noAuxiliar.getRefNo();

            }else{
                break;
            }
        }
        stringRetorno += "\n===================FIM DO PROGRAMA===================";
        return stringRetorno;
    }


}
