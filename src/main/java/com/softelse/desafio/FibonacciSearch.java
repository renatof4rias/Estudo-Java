package com.softelse.desafio;

public class FibonacciSearch {
    public static void main(String[] args) {

        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 89, 144, 233, 377, 610, 55};

        int elemento = 55;
        int retorno = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento){
               retorno = i;
            }
        }

        System.out.println(retorno);

    }
}
