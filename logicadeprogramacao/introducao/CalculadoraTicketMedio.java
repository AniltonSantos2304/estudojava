package logicadeprogramacao.introducao;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraTicketMedio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de vendas: ");
        int numeroDeVendas = input.nextInt();
        double somaMedia = 0;
        double mediaVendas;

        for (int contador = 1; contador <= numeroDeVendas; contador++) {

            System.out.printf("\n----------------venda%d------------------\n", contador);
            System.out.print("Informe o valor da venda R$");
            double valorDaVenda = input.nextDouble();

            somaMedia += valorDaVenda;
        }

        mediaVendas = somaMedia / numeroDeVendas;

        System.out.printf("\nTicket Médio R$%,.2f", mediaVendas);

        input.close();
    }
}
