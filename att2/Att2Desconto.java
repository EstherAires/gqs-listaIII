package att2;
import java.util.Scanner;

class Desconto{
    public double DescontoProduto(double produto){
        return produto * 0.1;
    }
}

public class Att2Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double produto;
        Desconto aplicarDesconto = new Desconto();

        System.out.println("Informe o valor do produto:");
        produto = sc.nextDouble();

        System.out.println("-------------------------------\n");

        double desconto = produto - (aplicarDesconto.DescontoProduto(produto)) ;

        System.out.println("Valor do prooduto com o desconto aplicado:\n" + desconto + "\n");

        sc.close();
    }
}