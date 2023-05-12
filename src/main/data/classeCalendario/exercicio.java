package br.com.javes.data.classeCalendario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("\n\n       !!!!!!!!!!!!!!BEM VINDO!!!!!!!!!!!!!!\n");

        String vencimento;

        System.out.println("Digite a data de vencimento do seu boleto(dd/mm/yyyy): ");
        vencimento = ler.nextLine();

        System.out.println("\ntest: "+vencimento);


        Date dataVencimento = formatter.parse(vencimento);
        System.out.println("\ntest: "+dataVencimento);

        Calendar dataVencCal = Calendar.getInstance();
        dataVencCal.setTime(dataVencimento);

        dataVencCal.add(Calendar.DATE,10);
        System.out.printf("\nO vencimento do boleto é dia: %tc\n",dataVencCal);




    }

}
