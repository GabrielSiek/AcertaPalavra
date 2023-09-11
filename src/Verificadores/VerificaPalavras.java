package Verificadores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class VerificaPalavras {

    private Scanner input;
    private List<String> palavras;

    public VerificaPalavras(int letras) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("palavras"+ letras + "Letras.txt"));
            input = new Scanner(reader);
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println(e);
        }
        Locale.setDefault(Locale.ENGLISH);
        input.useLocale(Locale.ENGLISH);
        palavras = new ArrayList<>();
    }

    public void restauraIO() {
        input = new Scanner(System.in);
    }

    public List<String> adicionarPalavras() {
        palavras = new ArrayList<>();

        for (int i = 0; input.hasNextLine(); i++) {
            palavras.add(input.nextLine());
        }

        return palavras;
    }
}
