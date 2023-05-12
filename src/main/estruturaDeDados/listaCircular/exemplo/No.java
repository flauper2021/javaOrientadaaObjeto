package br.com.javes.estruturaDeDados.listaCircular.exemplo;

// primeiro se determina o tipo de dado que a classe recebe: public class "No" vai receber tipo generico "T".

public class No <T> {

    //se determina que o conteudo da classe "No" na estrutura do objeto sera do tipo generico T de nome conteudo.
    private T conteudo;


    // cria o elo de ligação para os "Nós".
    private No <T> noProximo;

    // a estrutura central do Nó e formada em private para que ela não sofra o risco de ser manipulada externamente.
    // para a manipulação desses dados que serão criados, se utiliza os construtores "get e set".

    // para a manipulação dessa estrutura criada, deve se criar antes o contrutor do No, que serão publicas
    // para possibilitar a sua manipulãção.

    public No (T conteudo){

        // nesse construtor declaramos que inicialmente o noProximo(que foi criado para ser o elo de ligação entre "Nós"
        // sempre inicia sua referencia para o nada, pois não existe ainda "Nós" para ele se ligar.

        this.noProximo = null;
        this.conteudo = conteudo;

    }

    //após a criação do construtor do "Nó" devemos criar o metodo de manipular seus dados,
    // se faz isso usando get para pegar a informação criada e set para incluir informão ao objeto já criado.

    public T getConteudo(){
        return conteudo;
    }
    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo(){
        return noProximo;
    }
    public void setNoProximo(No<T> noProximo){
        this.noProximo = noProximo;
    }

    // o uso do toString serve no meu entender para testar a funcionalidade da classe criada.

    @Override
    public String toString(){
        return "No{ "
                + "conteudo = " + conteudo +
                '}';

    }





}
