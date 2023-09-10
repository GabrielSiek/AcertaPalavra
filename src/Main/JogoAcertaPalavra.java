package Main;

import JogosIndividual.JogoIndividual;
import Menus.MenuInicial;

public class JogoAcertaPalavra {

    private boolean encerrarJogo = false;

    public void setEncerrarJogo(boolean encerrarJogo) {
        this.encerrarJogo = encerrarJogo;
    }

    public void executar() {
        MenuInicial menuInicial = new MenuInicial();

        while (!encerrarJogo) {
            int opcao = menuInicial.opcaoMenuInicial();
            switch (opcao) {
                case 0 -> encerrarJogo = true;
                case 1 -> new JogoIndividual().executar();
                case 2 -> {}
            }
        }
        System.out.println("Fim de jogo");
    }
}


