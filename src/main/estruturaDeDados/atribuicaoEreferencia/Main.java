package br.com.javes.estruturaDeDados.atribuicaoEreferencia;

public class Main {

    public static void main(String[] arg){

        int intA = 1;
        int intB = intA;
        System.out.println("\nintA = "+intA+ "\nintB = "+intB);

        intA = 2;
        System.out.println("intA = "+intA+ "\nintB = "+intB);
        // no caso dos tipos primitivos, a atribuição é feita no momento da declaração,
        // recebendo o valor indicado naquele momento.

        MeuObj objA = new MeuObj((1));
        MeuObj objB = objA;
        System.out.println("\nObjA= "+objA+", objB= "+objB+".\n");

        objA.SetNum(2);
        System.out.println("\nObjA= "+objA+", objB= "+objB+".\n");
        // no caso de objeto, a atribuição realizada é feito diretamente no endereçamento
        // de memoria e sempre que for evocado, buscará o valor que estiver alocado na mesma.

    }

}
