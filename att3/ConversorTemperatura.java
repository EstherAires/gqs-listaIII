package att3;
import java.util.Scanner;

class Conversor{
    public Double converteTemperatura(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
}

public class ConversorTemperatura{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura, temperaturaConvertida;

        Conversor conversor = new Conversor();
        
        System.out.println("Informe a termperatura em Fahrenheit, ela será convertida para celcius:");
        temperatura = sc.nextDouble();

        temperaturaConvertida = conversor.converteTemperatura(temperatura);

        System.out.println("\n" + temperatura + "°F é equivalente a " + temperaturaConvertida + "°\n\n");
    
        sc.close();
    }
}