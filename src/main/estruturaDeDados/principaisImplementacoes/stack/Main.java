package br.com.javes.estruturaDeDados.principaisImplementacoes.stack;


import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // o push acrescenta itens a pilha.

        Stack <Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Fiat"));
        stackCarros.push(new Carro("Chevrolet"));

        System.out.println(stackCarros);

        // o pop retira o primeiro item da pilha.

        stackCarros.pop();

        System.out.println(stackCarros);

        // o peek demonstra qual o primeiro item da fila sem retira-lo.

        stackCarros.peek();

        System.out.println(stackCarros);

        // o empty verifica se a pilha esta vazia.

        System.out.println(stackCarros.empty());


    }

}
