package logicadeprogramacao.introducao;

import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de funcionários: ");
        int numeroDeFuncionarios = input.nextInt();

        input.nextLine();

        for (int contador = 1; contador <= numeroDeFuncionarios; contador++){
            System.out.printf("\n------------------------------Funcionário%d-----------------------------\n", contador);

            System.out.print("Digite o seu nome: ");
            String nome = input.nextLine();

            System.out.print("Digite o seu valor por hora R$");
            double valorHora = input.nextDouble();

            System.out.print("Digite as horas trabalhadas: ");
            int horasTrabalhadas = input.nextInt();

            System.out.print("Digite o valor do desconto R$");
            double valorDesconto = input.nextDouble();

            double calculoSalario = horasTrabalhadas * valorHora;
            double salarioFuncionario =  calculoSalario - valorDesconto;

            System.out.printf("\n--------------------Folha_de_Pagamento_Funcionário%d--------------------\n", contador);

            System.out.printf("\nFolha de pagamento:%s" +
                            "\n%d horas X R$%,.2f = R$%,.2f" +
                            "\nDescontos: R$%,.2f" +
                            "\nTotal devido: R$%,.2f",
                    nome, horasTrabalhadas, valorHora, calculoSalario , valorDesconto, salarioFuncionario);

            input.nextLine();
        }

        input.close();
    }
}
