package br.com.javes.classes.finals;

public class Programa {

    public static void main(String[] args) {

        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final var game = "PUBG";

        //"game = "Stand Valey";

        System.out.println("\n");

        System.out.println(casualGamer.play(game));

        System.out.println("\n");

        System.out.println(casualGamer.mouse());
        System.out.println(casualGamer.keyboard());
        System.out.println(gamer.keyboard());

        System.out.println("\n");

        System.out.println(hardcoreGamer);

        System.out.println("\n");

        System.out.println(gamer);


        System.out.println("\n!!!!!!FIM DE PROGRAMA!!!!!!!!!");
    }


}