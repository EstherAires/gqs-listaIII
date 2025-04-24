package att7;
import java.util.Scanner;

class CalculadoraSalario {
    private double salarioFixo;
    private double totalVendas;
    private double percentualComissao;

    public CalculadoraSalario(double salarioFixo, double totalVendas, double percentualComissao) {
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public double calcularSalarioTotal() {
        double comissao = (percentualComissao / 100) * totalVendas;
        return salarioFixo + comissao;
    }
}


public class SalarioFixo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("\nDigite o valor total das vendas no mês: ");
        double totalVendas = scanner.nextDouble();

        System.out.println("\nDigite o percentual de comissão (%): ");
        double percentualComissao = scanner.nextDouble();

        CalculadoraSalario calculadora = new CalculadoraSalario(salarioFixo, totalVendas, percentualComissao);

        double salarioTotal = calculadora.calcularSalarioTotal();

        System.err.println("----------------------------------------------------");
        System.out.printf("O salário total do vendedor é: R$ %.2f\n", salarioTotal);

        scanner.close();
    }
}