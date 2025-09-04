  import java.util.Scanner;
public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[7][7];
        int[] maiorLinha = new int[7];
        int[] menorColuna = new int[7];
        System.out.println("Digite os elementos da matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = sc.nextInt();
            }
             }
        for (int i = 0; i < 7; i++) {
            int max = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
            maiorLinha[i] = max;
      }

        for (int j = 0; j < 7; j++) {
            int min = matriz[0][j];
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
            menorColuna[j] = min;
            }


        System.out.println("\nMatriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nVetor com o maior elemento de cada linha:");
        for (int val : maiorLinha) {
            System.out.print(val + " ");
        }

        System.out.println("\nVetor com o menor elemento de cada coluna:");
        for (int val : menorColuna) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}

