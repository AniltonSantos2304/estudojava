package logicadeprogramacao.introducao;

import java.util.Scanner;

public class CalculadoraAnosMesesDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a sua data de nascimento(DD/MM/YYYY): ");
        String dataNascimento = input.nextLine().replace("/", "").replace("-","");



    }
}
