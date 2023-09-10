package Menus;

import Verificadores.VerificaInt;

import java.util.Scanner;

public class MenuJogoIndividual {

    private void printMenuJogoIndividual() {
        System.out.println("Digite 5 para jogar com uma palavra de 5 letras");
        System.out.println("Digite 6 para jogar com uma palavra de 6 letras");
        System.out.println("Digite 7 para jogar com uma palavra de 7 letras");
        System.out.println("Digite 0 para voltar");
    }

    private int verificaOpcaoMenuJogoIndividual() {
        VerificaInt verificaInt = new VerificaInt();
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int opcao = 0;

        while (!valido) {
            opcao = verificaInt.verificaInt();
            switch (opcao){
                case 5 -> valido = true;
                case 6 -> valido = true;
                case 7 -> valido = true;
                case 0 -> valido = true;
                default -> System.out.println("Opção inválida");
            }
        }

        return opcao;
    }

    public int opcaoMenuJogoIndividual() {
        printMenuJogoIndividual();
        return verificaOpcaoMenuJogoIndividual();
    }
}
