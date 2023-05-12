package br.com.javes.data.classeCalendario;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();
        System.out.println("\n" +agora);

        System.out.println("\nA data corrente agora é: "+agora.getTime());


        agora.add(Calendar.DATE,-15);
        System.out.println("\nÀ 15 dias atrás: "+agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("\nA 4 meses depois: "+agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("\nA 2 anos a frente: "+agora.getTime());

        // NOTE QUE O TEMPO MANIPULADO FICA INSTACIANDO NA ULTIMA MODIFICAÇÃO.

        agora = Calendar.getInstance();
        System.out.println("\n"+agora.getTime());

        System.out.printf("\n%tc\n",agora);
        System.out.printf("\n%tF\n",agora);
        System.out.printf("\n%tD\n",agora);
        System.out.printf("\n%tr\n",agora);
        System.out.printf("\n%tT\n",agora);




        System.out.println("\n       !!!!!!!!!!!!!FIM DO PROGRAMA!!!!!!!!!!!!!!");
    }

}
