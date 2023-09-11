package Verificadores;

import java.util.Scanner;

public class VerificaQuantChar {

    public String verificaQuantChar(int letras){
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        while (palavra.length() != letras){
            if(palavra.length() > letras)
                System.out.println("Palavra digitada com menos de " + letras + "letras. Insira novamente");
            else
                System.out.println("Palavra digitada com mais de " + letras + "letras. Insira novamente");
            palavra = sc.nextLine();
        }
        return palavra;
    }
}
