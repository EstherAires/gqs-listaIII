package att5;
import java.util.Scanner;

class CalculaSalarioBruto{
    public Double calculo(double horas, double valorHora, double salarioFamilia, int filhosMenores){
        return (horas * valorHora) + (salarioFamilia * filhosMenores);
    }
}

public class CalcularSalarioBruto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double horas, valorHora, salarioFamilia, salarioBruto;
        int filhosMenores;

        CalculaSalarioBruto salarioBrutoObj = new CalculaSalarioBruto();

        System.out.println("Informe o número de horas trabalhadas:");
        horas = sc.nextDouble();

        System.out.println("\nInforme o valor por hora trabalhada:");
        valorHora = sc.nextDouble();

        System.out.println("\nInforme o valor do salário família por filho:");
        salarioFamilia = sc.nextDouble();

        System.out.println("\nInforme o número de filhos menores de 14 anos:");
        filhosMenores = sc.nextInt();

        salarioBruto = salarioBrutoObj.calculo(horas, valorHora, salarioFamilia, filhosMenores);

        System.out.println("-------------------------------------------------");
        System.out.printf("\nO salário bruto é: %.2f%n", salarioBruto);
        System.out.println("\n\n");

        sc.close();
    }
}
