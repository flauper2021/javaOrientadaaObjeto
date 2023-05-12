package br.com.javes.data.classeData;

import java.util.Date;

public class LongaData {

    public static void main(String[] args) {

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("\ntest "+currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);
        System.out.println("\ntest"+novaData);

        long novaCurrent = novaData.getTime();
        System.out.println("\ntest "+novaCurrent);

        Date dataAniv = new Date(1974, 9, 4);
        long currentDataAni = dataAniv.getTime();
        System.out.println("\n Aniversário: "+currentDataAni);


    }


}
