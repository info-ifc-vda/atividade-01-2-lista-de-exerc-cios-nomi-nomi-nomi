import java.util.Scanner;

class AtividadeUma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o número de horas:");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Digite o valor da hora:");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;
        double imposto = salario * 0.30;
        double salario2 = salario - imposto;
        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Salário a Receber: R$ " + salario2);

 }
}