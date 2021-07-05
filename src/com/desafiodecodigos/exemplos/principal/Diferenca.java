package com.desafiodecodigos.exemplos.principal;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        // fazendo o cálculo.
        int somatoria = ((a*b) - (c*d)); // variável usada para fazer o cálculo final.
        System.out.println("DIFERENCA = " + somatoria);
    }
}
