package att1;
import java.util.Scanner;


class Calculadora{
    public double calculaMedia(double n1, double n2) {
        return ( (n1 + n2) / 2);
    }
}

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        double n1, n2, media;
        
        System.out.println("Informe o primeiro número: ");
        n1 = sc.nextDouble();
        
        System.out.println("Informe o segundo número: \n");
        n2 = sc.nextDouble();
        
        media = calculadora.calculaMedia(n1, n2);
        
        System.out.println("------------------------------");
        System.out.println("A média aritmética é: " + media + "\n");
        
        sc.close();
    }
}