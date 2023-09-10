package JogosIndividual;

import Main.JogoAcertaPalavra;
import Menus.MenuJogoIndividual;

import java.util.ArrayList;

public class JogoIndividual {

    public void executar(){
        MenuJogoIndividual menuJogoIndividual = new MenuJogoIndividual();
        int opcao = menuJogoIndividual.opcaoMenuJogoIndividual();

        switch (opcao) {
            case 0 -> new JogoAcertaPalavra().setEncerrarJogo(false);
            case 5 -> {}
            case 6 -> {}
            case 7 -> {}
        }
    }

}







//
//    private ArrayList<String> adicionarPalavras() {
//        ArrayList<String> palavras = new ArrayList<>();
//
//        for (int i = 0; input.hasNextLine(); i++) {
//            palavras.add(input.nextLine());
//        }
//
//        return palavras;
//    }