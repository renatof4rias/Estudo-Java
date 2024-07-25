package com.softelse.desafio;

public class JumpSearch {
    public static void main(String[] args) {

        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int salto = 4;
        int elemento = 55;

        for (int i = 0; i < array.length ; i+= salto) {

        if (array[i] > elemento){
            i -= 4;
            for (int j = i; j < array.length; j++) {
                if (array[j] == elemento){
                    System.out.println("Elemento Encontrado no Index [" + j +"]");
                }
            }
            break;
        }

        }
    }
}
