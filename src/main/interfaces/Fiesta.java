package br.com.javes.interfaces;

public class Fiesta implements Carro,Veiculo{

    @Override
    public String marca(){
        return "Ford";
    }

    @Override
    public String registro(){
        return "123AF6547TRJ";
    }
    @Override
    public void Ligar(){
        Carro.super.ligar();

        Veiculo.super.Ligar();
    }



}
