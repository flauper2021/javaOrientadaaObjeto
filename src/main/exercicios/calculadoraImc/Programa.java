package br.com.javes.exercicios.calculadoraImc;
import br.com.javes.exercicios.calculadoraImc.imc.CalculadoraDeImc;
import br.com.javes.exercicios.calculadoraImc.imc.Pessoa;

public class Programa {

    public static void main(String[] args) {
        System.out.println("\nCALCULANDO IMC!\n");

        final Pessoa pessoa = new Pessoa("André", 1.9, 100.0);

        final var calculadoraDeImc = new CalculadoraDeImc();
        final var imc = calculadoraDeImc.calcula(pessoa);

        System.out.println("IMC = "+imc);

        System.out.println("\n\n !!!!!!!!!!!FIM DO PROGRAMA!!!!!!!!!!!!");
    }

}
