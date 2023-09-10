package Menus;

import Verificadores.VerificaInt;

import java.util.Scanner;

public class MenuInicial {


    private int verificaOpcaoMenuInicial() {
        VerificaInt verificaInt = new VerificaInt();
        boolean valido = false;
        int opcao = 0;

        while (!valido) {
            opcao = verificaInt.verificaInt();
            switch (opcao){
                case 0 -> valido = true;
                case 1 -> valido = true;
                case 2 -> valido = true;
                default -> System.out.println("Valor inválido. Insira novamente");
            }
        }

        return opcao;
    }

    private void printMenuInicial() {
        System.out.println("Digite 1 para jogar individual");
        System.out.println("Digite 2 para jogar 1x1");
        System.out.println("Digite 0 para sair");
    }

    public int opcaoMenuInicial() {
        printMenuInicial();
        return verificaOpcaoMenuInicial();
    }
}
