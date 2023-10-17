package logicadeprogramacao.introducao;

import java.util.Scanner;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class ConversorDeTemperatura {
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus célsius°C: ");
        double grauCelsius = input.nextDouble();

        final double GRAU_KELVIN = grauCelsius + 273.15;
        final double GRAU_REAUMUR = grauCelsius * 0.8;
        final double GRAU_RANKINE = ((grauCelsius * 1.8) + 32 + 459.67);
        final double GRAU_FAHRENHEIT = (grauCelsius * 1.8) + 32;

        System.out.println("\nConvertendo temperatura...\n");
        TimeUnit.SECONDS.sleep(2);

        System.out.printf("Temperatura convertida:" +
                        "\nTemperatura em Kelvin %.2f" +
                        "\nTemperatura em Réaumur %.2f" +
                        "\nTemperatura em Rankine %.2f" +
                        "\nTemperatura em Fahrenheit %.2f",
                GRAU_KELVIN, GRAU_REAUMUR, GRAU_RANKINE, GRAU_FAHRENHEIT);

        input.close();
    }
}
