package br.com.javes.interfaces;

public interface Veiculo {

    String registro();

    default void Ligar(){
        System.out.println("Ligando o veículo");
    }
    // void desligar();
    //default void desligar(){
    //System.out.println("Desligando o veículo!");
    //}







}
