package br.com.javes.exercicios;


import java.io.IOException;
import java.util.Scanner;


public class exercicio02 {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        String nome, osexo, gen, respGorMag;
        int idade;
        char sexo;
        double h, pesoIdeal, gordoMagro;


        System.out.println("\nSeja bem vindo!\n");

        System.out.println(" Informe o seu nome: ");
            nome = ler.nextLine();

        System.out.println("\nInforme agora sua idade: ");
            idade = ler.nextInt();

        ler.nextLine();

        System.out.println("\nInforme o seu sexo(M/F): ");
            sexo = (char)System.in.read();

        System.out.println("\nInforme a sua altura(em metros): ");
            h = ler.nextDouble();

        System.out.println("\n Agora informe seu peso (em quilos): ");
            gordoMagro = ler.nextDouble();

        if ((sexo == 'M') || (sexo == 'm')) {
            pesoIdeal = (72.7 * h) - 58;
        }
        else
            pesoIdeal = (62.1 * h) -44.7;

        if ((sexo == 'M') || (sexo == 'm')) {
            osexo = "masculino";
        }else
            osexo = "feminino";

            if (osexo == "masculino") {
                gen = "Sr.";
            }else
                gen = "Sra.";

            if (gordoMagro > pesoIdeal){
                respGorMag = "você está gordo demais, vai fazer dieta porquinho!";
            }else
                respGorMag = "continue assim!";

        System.out.println("\n " +gen+" " +nome+ " você tem "+idade+ "anos de idade, é do sexo "+osexo+ ", tem a altura\n " +
                "de "+h+ " metros, e o seu peso ideal é de aproximadamente "+pesoIdeal+ " kilos, sendo assim temos que\n" +
                " afirmar que " +respGorMag);

        System.out.println("\n FIM DO PROGRAMA!!!");

        }


    }


