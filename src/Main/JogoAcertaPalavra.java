package Main;

import Jogos.JogoIndividual;
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
                case 1 -> {
                    JogoIndividual jogoIndividual = new JogoIndividual();
                    jogoIndividual.executar();
                    encerrarJogo = menuInicial.fimDeJogoIndividual(jogoIndividual.getPalavra(), jogoIndividual.getTentativas());
                }
                case 2 -> {}
            }

        }
        System.out.println("Obrigado por jogar meu jogo!");
        System.out.println("Volte sempre :)");
    }
}


