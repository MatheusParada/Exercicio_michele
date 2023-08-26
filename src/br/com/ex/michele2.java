package br.com.ex;
import java.util.Scanner;

public class michele2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[4][5]; // 4 prateleiras por 5 armários

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite o número do armário (0-4):");
            int armario = scanner.nextInt();
            System.out.println("Digite o número da prateleira (0-3):");
            int prateleira = scanner.nextInt();

            if (armario >= 0 && armario < 5 && prateleira >= 0 && prateleira < 4) {
                if (estoque[prateleira][armario] < 10) {
                    estoque[prateleira][armario]++;
                    System.out.println("Caixa adicionada com sucesso!");
                } else {
                    System.out.println("Espaço insuficiente no armário. Não é possível adicionar mais caixas.");
                }
            } else {
                System.out.println("Armário ou prateleira inválida.");
            }

            System.out.println("Deseja continuar? (true/false)");
            continuar = scanner.nextBoolean();
        }

        System.out.println("Quantidade de caixas em cada prateleira/armário:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(estoque[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
