package com.desafiodecodigos.exemplos.principal;

import java.util.Scanner;

public class AnaliseDeNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // declarando as variaveis para ser usadas
        int pares = 0;
        int impares = 0;
        int positivo = 0;
        int neg = 0;

        // criando um loop para ver se a condição dos numeros são pares, impares como também
        // se é positivo ou negativo
        for (int i = 0; i < 5; i++) {
            int valorConsultado = leitor.nextInt();
            if ((valorConsultado % 2) == 0) {
                pares++;
            } else {
                impares++;
            }
            if (valorConsultado > 0)
                positivo++;
            else {
                if (valorConsultado < 0)
                    neg++;
            }

        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}

