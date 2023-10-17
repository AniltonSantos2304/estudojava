package logicadeprogramacao.introducao;
import java.util.Scanner;

public class CalculadoraPrecoProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do produto R$");
        double valorProduto = input.nextDouble();

        System.out.println("-------------------Método_de_Pagamento--------------------------");

        double valorDesconto;
        double valorProdutoDepoisDoDesconto;
        double valorDoProdutoParcelado;

        System.out.print("Escolha uma forma de pagamento:\n" +
                "1) À vista em dinheiro ou pix, recebe 15% de desconto." +
                "\n2) À vista no cartão de crédito ou cartão de débito recebe 10% de desconto." +
                "\n3) Parcelado no cartão de crédito em duas vezes, preço normal do produto sem juros." +
                "\n4) Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%." +
                "\nEscolha uma opção: ");
        int opcao = input.nextInt();

        System.out.println("--------------------Valor_a_Pagar-------------------------");

        switch (opcao){
            case 1:
                valorDesconto =  15.0 / 100;
                valorProdutoDepoisDoDesconto = valorProduto - (valorProduto * valorDesconto);
                System.out.printf("Você deve pagar R$%,.2f", valorProdutoDepoisDoDesconto);
                break;
            case 2:
                valorDesconto =  10.0 / 100;
                valorProdutoDepoisDoDesconto = valorProduto - (valorProduto * valorDesconto);
                System.out.printf("Você deve pagar R$%,.2f", valorProdutoDepoisDoDesconto);
                break;
            case 3:
                valorDoProdutoParcelado = valorProduto / 2;
                System.out.printf("Você deve pagar 2 parcelas de R$%,.2f", valorDoProdutoParcelado);
                break;
            case 4:
                System.out.print("Informe o número de parcelas: ");
                int numeroDeParcelas = input.nextInt();
                final double VALOR_JUROS_PARCELADO = 10.0 / 100;
                valorDoProdutoParcelado = (valorProduto + (valorProduto * VALOR_JUROS_PARCELADO)) / numeroDeParcelas;
                System.out.printf("Você deve pagar %d parcelas de R$%,.2f",numeroDeParcelas ,valorDoProdutoParcelado);
                break;
            default:
                System.out.println("Opção ínvalida!");
        }
        input.close();
    }
}
