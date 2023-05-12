package br.com.javes.estruturaDeDados.encadeamentoeNo;

public class Main {

    public static void main(String[] args) {

        No no1 = new No("Conteudo do no 1");
        No no2 = new No("Conteudo do no 2");
        No no3 = new No("Conteudo do no 3");
        No no4 = new No("Conteudo do no 4");

        // para fazer o encadeamento, tem que fazer a referencia ao proximo nó conforme criado no objeto No.

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);
        //no1->no2->no3->no4->null

        System.out.println("\n"+no1+"\n");
        System.out.println("\n"+no1.getProximoNo()+"\n");
        System.out.println("\n"+no1.getProximoNo().getProximoNo()+"\n");
        System.out.println("\n"+no1.getProximoNo().getProximoNo().getProximoNo()+"\n");
        System.out.println("\n"+no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()+"\n");


    }

}
