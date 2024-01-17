package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class RaioCirculo {
    public static void main(String[] args) {

        double valorRaio;

        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //aceita valor com ponto

        valorRaio = scanner.nextDouble();
        double calculoRaioCirculo = (valorRaio* valorRaio * pi);

        scanner.close();

        System.out.printf("calculoRaioCirculo = %.4f%n", calculoRaioCirculo);
    }
}
