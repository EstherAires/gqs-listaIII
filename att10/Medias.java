package att10;
import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double c = scanner.nextDouble();

        double mediaAritmetica = (a + b + c) / 3;
        double mediaHarmonica = 3 / ((1 / a) + (1 / b) + (1 / c));
        double mediaGeometrica = Math.cbrt(a * b * c); // raiz cúbica

        System.out.printf("Média Aritmética: %.2f%n", mediaAritmetica);
        System.out.printf("Média Harmônica: %.2f%n", mediaHarmonica);
        System.out.printf("Média Geométrica: %.2f%n", mediaGeometrica);

        scanner.close();
    }
}



