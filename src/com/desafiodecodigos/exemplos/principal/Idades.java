package com.desafiodecodigos.exemplos.principal;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        // declarando as variáveis
        double soma = 0.0;
        int n = 1;
        while (n >= 1) {
            n = leitor.nextInt();
            if (n >= 0) {
                // verificando as condições;
                if(n != 0) {
                    // só vai somar se o n for diferente de zero.
                    soma = soma + n;
                    cont++;
                }
            } else {
                // se for igual a zero aplica n=0 para sair do while.
                n = 0;
            }
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
    }
}
