import java.util.Scanner;

public class Atividade9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " não é primo.");
            sc.close();
            return;
        }

        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
        sc.close();
    }
}
