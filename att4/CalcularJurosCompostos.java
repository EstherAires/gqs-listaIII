package att4;
import java.util.Scanner;
import java.lang.Math;

class CalculaJuros{
    public Double calculo(double capital, double taxa, int prazo){
        taxa = taxa / 100;
        return capital * Math.pow((1 + taxa), prazo);
    }
}

public class CalcularJurosCompostos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double capital, taxa, montante;
        int prazo;

        CalculaJuros jurosCompostos = new CalculaJuros();
        
        System.out.println("Informe o capital a ser aplicado:");
        capital = sc.nextDouble();

        System.out.println("\nInforme o prazo de aplicação em meses:");
        prazo = sc.nextInt();

        System.out.println("\nInforme a taxa de juros mensal:");
        taxa = sc.nextDouble();

        montante = jurosCompostos.calculo(capital, taxa, prazo);

        System.out.printf("O montante final após %d meses será: %.2f%n", prazo, montante);
    
        sc.close();
    }
}