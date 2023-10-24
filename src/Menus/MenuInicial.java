package Menus;

import Verificadores.VerificaInt;

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
        //System.out.println("Digite 2 para jogar 1x1");
        System.out.println("Digite 0 para sair");
    }

    public int opcaoMenuInicial() {
        printMenuInicial();
        return verificaOpcaoMenuInicial();
    }

    public boolean fimDeJogoIndividual(String palavra, int tentativas) {
        VerificaInt verificaInt = new VerificaInt();
        System.out.println(palavra);
        System.out.println("Parabéns!");
        System.out.println("Acertou a palavra em " + tentativas + " tentativas");
        System.out.println("Digite 1 para voltar ao menu principal");
        System.out.println("Digite 2 para sair");
        boolean valido = false;
        while (!valido) {
            switch (verificaInt.verificaInt()) {
                case 1 -> {
                    valido = true;
                }
                case 2 -> {
                    return true;
                }
                default -> System.out.println("Valor inválido. Insira novamente");
            }
        }
        return false;
    }
}
