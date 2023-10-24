package Jogos;

import Main.JogoAcertaPalavra;
import Menus.MenuJogoIndividual;
import Verificadores.VerificaPalavras;
import Verificadores.VerificaQuantChar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JogoIndividual {
    private MenuJogoIndividual menuJogoIndividual = new MenuJogoIndividual();
    private List<String> palavras;
    VerificaQuantChar verificaQuantChar = new VerificaQuantChar();

    private String palavra = " ";
    private int tentativas = 0;
    public void executar(){
        int opcao = menuJogoIndividual.opcaoMenuJogoIndividual();

        switch (opcao) {
            case 0 -> new JogoAcertaPalavra().setEncerrarJogo(false);
            case 5 -> jogo(5);
            case 6 -> jogo(6);
            case 7 -> jogo(7);
        }
    }

    private void jogo(int letras){
        adivinharPalavra(letras);
    }


    private void adivinharPalavra(int letras) {
        palavra = gerarPalavra(letras);
        String palavraAdivinhar = UnderLinePalavra(letras);
        String palavraTentativa = "";
        while (!palavraTentativa.equals(palavra)) {
            System.out.println(palavraAdivinhar);
            System.out.print("palavra: ");
            palavraTentativa = verificaQuantChar.verificaQuantChar(letras);
            if(!palavraTentativa.equals(palavra)) {
                revisarPalavra(palavra, palavraTentativa);
                palavraAdivinhar = reescreverPalavra(palavra, palavraTentativa, palavraAdivinhar);
            }
            tentativas++;
        }
    }

    private void adicionaPalavras(int letras) {
        VerificaPalavras verificaPalavras = new VerificaPalavras(letras);
        palavras = verificaPalavras.adicionarPalavras();
    }

    private String gerarPalavra(int letras) {
        Random rand = new Random();
        adicionaPalavras(letras);
        int size = palavras.size();
        int intRandom = rand.nextInt(size);
        return palavras.get(intRandom);
    }

    private String UnderLinePalavra(int letras) {
        if(letras == 5)
            return "_____";
        else if(letras == 6)
            return "______";
        else
            return "_______";
    }

    private void revisarPalavra(String palavraCerta, String palavraTentativa) {
        StringBuilder str = new StringBuilder(palavraCerta);
        for(int i = 0; i < palavraCerta.length(); i++){
            String charPC = Character.toString(palavraCerta.charAt(i));
            String charPT = Character.toString(palavraTentativa.charAt(i));
            if(charPC.equals(charPT)) {
                System.out.println("A letra " + charPT + " está na posição certa");
                str.setCharAt(i, '_');
            }
        }
        for(int i = 0; i < palavraCerta.length(); i++){
            String charPT = Character.toString(palavraTentativa.charAt(i));
            if(str.toString().contains(charPT))
                System.out.println("A letra " + charPT + " está na palavra");
        }
    }

    private String reescreverPalavra(String palavraCerta, String palavraTentativa, String palavraAdivinhar) {
        StringBuilder str = new StringBuilder(palavraAdivinhar);
        for(int i = 0; i < palavraCerta.length(); i++){
            Character charPC = palavraCerta.charAt(i);
            Character charPT = palavraTentativa.charAt(i);
            if(charPC.equals(charPT))
                str.setCharAt(i, charPC);
        }
        return str.toString();
    }

    public String getPalavra() {
        return palavra;
    }

    public int getTentativas() {
        return tentativas;
    }
}
