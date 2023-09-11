package Verificadores;

import java.util.Scanner;

public class VerificaInt {

    public int verificaInt() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;

        while (true) {
            try {
                valido = true;
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Valor inválido. Insira novamente");
                valido = false;
                sc.next();
            }
        }
    }
}
