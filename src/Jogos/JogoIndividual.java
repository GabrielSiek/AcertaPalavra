package JogosIndividual;

import Main.JogoAcertaPalavra;
import Menus.MenuJogoIndividual;
import Verificadores.VerificaPalavras;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JogoIndividual {

    List<String> palavras;
    public void executar(){
        MenuJogoIndividual menuJogoIndividual = new MenuJogoIndividual();
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
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        String palavra = gerarPalavra(letras);
        String palavraAdivinhar = UnderLinePalavra(letras);
        String palavraTentativa = "";
        while (!palavraTentativa.equals(palavra)) {
            System.out.println(palavraAdivinhar);
            System.out.print("palavra: ");
            palavraTentativa = sc.nextLine().toLowerCase();
            if(!palavraTentativa.equals(palavra)) {
                revisarPalavra(palavra, palavraTentativa);
                palavraAdivinhar = reescreverPalavra(palavra, palavraTentativa, palavraAdivinhar);
            }
            tentativas++;
        }
        System.out.println("Acertou a palavra em " + tentativas + " tentativas");
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
        for(int i = 0; i < palavraCerta.length(); i++){
            String charPC = Character.toString(palavraCerta.charAt(i));
            String charPT = Character.toString(palavraTentativa.charAt(i));
            if(charPC.equals(charPT))
                System.out.println("A letra " + charPT + " está na posição certa");
            else
                if(palavraCerta.contains(charPT))
                    System.out.println("A letra " + charPT + " está na palavra");
        }
    }

    private String reescreverPalavra(String palavraCerta, String palavraTentativa, String palavraAdivinhar) {
        for(int i = 0; i < palavraCerta.length(); i++){
            String charPC = Character.toString(palavraCerta.charAt(i));
            String charPT = Character.toString(palavraTentativa.charAt(i));
            if(charPC.equals(charPT))
                palavraAdivinhar.replace(palavraAdivinhar.charAt(i), palavraCerta.charAt(i));
        }
        return palavraAdivinhar.toString();
    }
}
