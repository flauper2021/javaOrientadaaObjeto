package br.com.javes.inicial;

import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {
    int numero;


    Scanner tela = new Scanner(System.in);

        System.out.println("\n Informe um numero: ");
            numero = tela.nextInt();

        System.out.println("\n O numero digitado foi: " +numero);

    }

}
