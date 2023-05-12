package br.com.javes.data.classeData.exercicio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ExercicioAulaData {

    public static void main(String[] args) {

        LocalDate localDateAntigo = LocalDate.of(1974, 9, 4);
        LocalDate localDateNovo = LocalDate.of(2010, 5, 15);


        LocalDateTime localDate = LocalDateTime.of(1974, 9, 4, 0,0,0);
        System.out.println("\nLocalDateTime = " + localDate);

        Date date1 = Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Date      = " + date1);

        localDate = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("LocalDate = " + localDate);

        long millis = date1.toInstant().toEpochMilli();

        System.out.println("\nO timeMillis do dia do meu aniversário é: "+millis);

        Date novaData = new Date(millis);
        System.out.println("\nO timeMillis da minha data de aniversário convertido em data é: "+novaData);

        System.out.println("\nteste data "+localDateNovo);
        System.out.println("\nteste data de aniversário "+localDateAntigo);

        var tempo = (localDateNovo.isAfter(localDateAntigo));
        if (tempo) {
            System.out.println("\nMinha data de aniversário é anterior a 15 de maio de 2010.");
        }else {
            System.out.println("\nMinha data de aniversário é posterior a 15 de maio de 2010");

        }



    }





}
