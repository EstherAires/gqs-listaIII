package att8;
import java.util.Scanner;

class EstacionamentoCalculo {
    private int totalVeiculos;
    private int totalRodas;

    public EstacionamentoCalculo(int totalVeiculos, int totalRodas) {
        this.totalVeiculos = totalVeiculos;
        this.totalRodas = totalRodas;
    }

    public int getCarros() {
        return (totalRodas - 2 * totalVeiculos) / 2;
    }

    public int getMotos() {
        return totalVeiculos - getCarros();
    }

    public boolean valoresValidos() {
        int carros = getCarros();
        int motos = getMotos();
        return carros >= 0 && motos >= 0 && (4 * carros + 2 * motos == totalRodas);
    }
}

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Digite o total de veículos no estacionamento: ");
        int totalVeiculos = scanner.nextInt();

        System.out.println("Digite o total de rodas no estacionamento: ");
        int totalRodas = scanner.nextInt();

        EstacionamentoCalculo calculo = new EstacionamentoCalculo(totalVeiculos, totalRodas);

        if (calculo.valoresValidos()) {
            System.out.println("Número de carros: " + calculo.getCarros());
            System.out.println("Número de motos: " + calculo.getMotos());
        } else {
            System.out.println("Os valores informados são inválidos. Verifique os dados e tente novamente.");
        }

        scanner.close();
    }
}


