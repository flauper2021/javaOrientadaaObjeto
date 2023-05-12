package br.com.javes.estruturaDeDados.principaisImplementacoes.equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Chevrolet"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(listaCarros.contains(new Carro("Volkswagem")));

        System.out.println(new Carro("Ford").hashCode());


    }

}
