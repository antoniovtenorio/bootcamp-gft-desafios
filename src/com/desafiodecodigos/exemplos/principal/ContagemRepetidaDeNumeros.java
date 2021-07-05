package com.desafiodecodigos.exemplos.principal;

import java.util.*;

public class ContagemRepetidaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));


        // declarando variável responsável por armazenar a lista de inteiros
        ArrayList<Integer> lista = new ArrayList<>();

        int n = sc.nextInt();
        int cont = 0;
        while ((cont < n) && (n <= 2000)) {
            lista.add(sc.nextInt());
            cont++;
        }
        //  declarando a variável responsável por fazer a ordenação.
        SortedMap<Integer, Integer> variavel = new TreeMap<>();
        lista.forEach(id -> variavel.compute(id, (k, v) -> (v == null ? 1 : v + 1)));

        variavel.forEach((key, value) -> System.out.printf("%d aparece %d vez(es)%n", key, value));
        sc.close();
    }
}
