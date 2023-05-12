package br.com.javes.classes.statics;

public class programa {

    public static void main(String[] args) {

        final Cachorro pitbul = new Cachorro();
        pitbul.zoologia = "Bipede"; //no modo static na classe "Cachorro" o atributo "Bipede" será integrado a todas as instancias, substituindo o "quadrupede".

        final Cachorro viralata = new Cachorro();

        System.out.println("\n");

        System.out.println(pitbul.zoologia);

        System.out.println(viralata.zoologia);

        System.out.println(Cachorro.late());

    System.out.println("\nFIM DO PROGRAMA!!!!!");
    }

}
