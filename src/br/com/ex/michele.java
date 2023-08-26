package br.com.ex;

import java.util.Random;

public class michele {
    public static void main(String[] args) {
        int vetor[] = new int[8];
        int contMaior30=0;
        int somaMaior30=0;
        int somaTotal=0;

        Random numrandomico = new Random();

        for (int i = 0; i < 8; i++) {
            vetor[i] = numrandomico.nextInt(999);
        }
        System.out.println("vetor:");
        for (int num : vetor){
            System.out.println(num + " ");
            somaTotal += num;

            if(num>30) {
                contMaior30++;
                somaMaior30 += num;

            }
        }

        System.out.println("\nQuantidade de números maiores que 30: " + contMaior30);

        // Imprimir a soma dos números maiores que 30
        System.out.println("Soma dos números maiores que 30: " + somaMaior30);

        // Imprimir a soma total de todos os elementos do vetor
        System.out.println("Soma total do vetor: " + somaTotal);
    }
}
