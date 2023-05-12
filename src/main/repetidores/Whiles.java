package br.com.javes.repetidores;

public class Whiles {

    public static void main(String[] args) {

        System.out.println("\n");

        var x = 0;
        //testa a condição antes

        while(x<1) {

            System.out.println("Dentro do While...\n");
            x++;
        }

        var y = 0;

        // testa a condição depois

        do {
            System.out.println("Dentro do Do While...\n");

        }while (y++<1);


    }

}
