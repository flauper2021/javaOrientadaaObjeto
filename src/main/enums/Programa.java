package br.com.javes.enums;

public class Programa {

    public static void main(String[] args) {

        System.out.println("\n");

        //final TipoVeiculo tipoVeiculo = new TipoVeiculo(); enums não pode estanciar na memoria

        System.out.println((TipoVeiculo.TERRESTRE)+"\n");

        //System.out.println((TipoVeiculo.valueOf("aereo"))); tem que ser maiuscula com no enum

        System.out.println(TipoVeiculo.valueOf("AEREO")+"\n");


        for (TipoVeiculo tipo: TipoVeiculo.values()) {
            System.out.println("Tipo: "+tipo);
        }

        System.out.println("\nCódigo de Status CLOSE: "+Status.CLOSE.getCod());
        System.out.println("\nCódigo de Status OPEM: "+Status.OPEM.getCod());
        System.out.println("\nTexto de Status CLOSE: "+Status.CLOSE.getTexto());
        System.out.println("\nTexto de Status OPEM: "+ Status.OPEM.getTexto());


        System.out.println("\n !!!!!!!!!!!!!!!FIM DE PROGRAMA!!!!!!!!!!!!!!!");




    }

}
