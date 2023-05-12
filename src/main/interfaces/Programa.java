package br.com.javes.interfaces;

public class Programa {

    public static void main(String[] args) {
        System.out.println("\n");

        final Gol gol = new Gol();

        System.out.println("marca do Gol: "+gol.marca());
        gol.ligar();

        final Veiculo trator = new Trator();

        System.out.println("Registro do Trator: " + (trator.registro()));
        trator.Ligar();


        final Fiesta fiesta = new Fiesta();

        System.out.println("Marca do Fiesta: " +fiesta.marca());
        System.out.println("Registro do Fiesta: " +fiesta.registro());

    }

}
