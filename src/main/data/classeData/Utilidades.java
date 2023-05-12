package br.com.javes.data.classeData;
import java.time.Instant;
import java.util.Date;

public class Utilidades {

    public static void main(String[] args) {

        Date dateNoPassado = new Date(1513121207691L);
        System.out.println("\n"+dateNoPassado);

        Date dateNoFuturo = new Date(1613124807691L);
        System.out.println("\n"+dateNoFuturo);

        boolean isAfter = dateNoPassado.after(dateNoFuturo);
        System.out.println("\n"+isAfter);

        boolean isBefore = dateNoPassado.before(dateNoFuturo);
        System.out.println("\n"+isBefore);

        Date dateInicio = new Date(1513124807691L);
        System.out.println("\n"+dateInicio);
        Instant intstant = dateInicio.toInstant();
        System.out.println("\n"+intstant);


    }

}
