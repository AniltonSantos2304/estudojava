package logicadeprogramacao.introducao;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        final double ABAIXO_DO_PESO = 18.5;
        final double PESO_IDEAL = 24.9;
        final double EXCESSO_DE_PESO = 29.9;
        final double OBESIDADE_GRAU_1 = 34.9;
        final double OBESIDADE_GRAU_2_SEVERA = 39.9;

        System.out.print("Quantas pessoas você deseja ver o imc: ");
        int numeroDePessoas = input.nextInt();

        input.nextLine();

        for (int contador = 1; contador <= numeroDePessoas; contador++) {
            System.out.printf("\n------------------Pessoa%d------------------\n", contador);

            System.out.print("Informe o peso da pessoa: ");
            double pesoPessoa = input.nextInt();

            System.out.print("Informe a altura da pessoa: ");
            double alturaPessoa = input.nextDouble();

            double imcPessoa = pesoPessoa / Math.pow(alturaPessoa, 2);

            if (imcPessoa <= ABAIXO_DO_PESO) {
                System.out.printf("Abaixo do peso, valor do imc: %.2f", imcPessoa);
            } else if (imcPessoa <= PESO_IDEAL) {
                System.out.printf("Peso ideal (parabéns), valor do imc: %.2f", imcPessoa);
            } else if (imcPessoa <= EXCESSO_DE_PESO) {
                System.out.printf("Excesso de peso, valor do imc: %.2f", imcPessoa);
            } else if (imcPessoa <= OBESIDADE_GRAU_1) {
                System.out.printf("Obesidade grau nível I, valor do imc: %.2f", imcPessoa);
            } else if (imcPessoa <= OBESIDADE_GRAU_2_SEVERA) {
                System.out.printf("Obesidade grau nível II (severa), valor do imc: %.2f", imcPessoa);
            } else {
                System.out.printf("Obesidade grau nível III (mórbida), valor do imc: %.2f", imcPessoa);
            }
        }
        input.close();
    }
}
