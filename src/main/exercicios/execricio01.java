package br.com.javes.exercicios;

import java.util.stream.IntStream;

public class execricio01 {

    public static void main(String[] args) {

        System.out.println("\n");

        IntStream.of(1,2,3,4,5).forEach (n-> {

            System.out.println(n);

        });

        System.out.println("\n");

        IntStream.range(4,10).forEach (n-> {

            System.out.println("Numero = "+n+"\n");

        });

    }

}
