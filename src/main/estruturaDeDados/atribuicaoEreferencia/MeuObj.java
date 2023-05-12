package br.com.javes.estruturaDeDados.atribuicaoEreferencia;

public class MeuObj {

    Integer num;

    public MeuObj(Integer num){
        this.num = num;
    }

    public void SetNum(Integer num){
        this.num = num;
    }

    @Override
    public String toString(){
        return this.num.toString();
    }


}
