package att6;
import java.util.Scanner;
import java.lang.Math;

public class CalcularLogaritmo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numero, logaritmo;

        System.out.println("Informe um número para calcular o logaritmo:");
        numero = sc.nextDouble();

        System.out.println("\nDigite a base do logaritmo: ");
        logaritmo = sc.nextDouble();


        if (numero <= 0 || logaritmo <= 0 || logaritmo == 1) {
            System.out.println("\n****************************************************************************************************************");
            System.out.println("* Número inválido. O logaritmo só é definido para números positivos. A base deve ser positiva e diferente de 1 *");
            System.out.println("****************************************************************************************************************");
        } else {
            double resultadoFinal = Math.log(numero)/ Math.log(logaritmo);
            System.out.println("\n-------------------------------------------------\n");
            System.out.printf("O logaritmo de %.2f na base %.2f  é: \n%.4f%n", numero, logaritmo, resultadoFinal);
        }

        System.out.println("\n\n");
        sc.close();
    }
}
