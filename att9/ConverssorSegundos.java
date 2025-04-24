package att9;
import java.util.Scanner;

public class ConverssorSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        
        System.out.println("Equivalente: " + horas + "h " + minutos + "min " + segundos + "s");

        scanner.close();
}}


