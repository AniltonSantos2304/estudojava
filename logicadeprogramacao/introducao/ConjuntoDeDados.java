package logicadeprogramacao.introducao;

import java.util.Scanner;
import java.util.Locale;

public class ConjuntoDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Número de pessoas: ");
        int numeroDePessoas = input.nextInt();

        double maiorAltura = 0;
        double menorAltura = 10;
        double somaMediaAlturaHomens = 0;
        double mediaAlturaHomens;
        int numeroDeMulheres = 0;
        int numeroDeHomens = 0;

        for (int contador = 1; contador <= numeroDePessoas; contador++) {

            System.out.printf("\n-----------------------Pessoa%d--------------------------\n", contador);

            System.out.print("Informe o seu gênero (1-Mulher e 2-Homem): ");
            int genero = input.nextInt();

            input.nextLine();

            System.out.print("Informe a sua altura: ");
            double altura = input.nextDouble();

            if (genero == 1) {
                numeroDeMulheres++;
            } else if (genero == 2) {
                numeroDeHomens++;
                somaMediaAlturaHomens += altura;
            } else {
                System.out.println("opção não encontrada!");
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            } else if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        mediaAlturaHomens = somaMediaAlturaHomens / numeroDeHomens;

        System.out.printf("\nMaior altura entre o grupo %.2f, Menor altura entre o grupo %.2f" +
                "\nMédia de altura entre os homens %.2f" +
                "\nNúmero de mulheres %d",
                maiorAltura, menorAltura, mediaAlturaHomens, numeroDeMulheres);
        input.close();
    }
}
