package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CalculaValorPecasRoupa {
    public static void main(String[] args) {

        int codigoPeca01, numeroPecas01, codigoPeca02, numeroPecas02;
        double valorUnitarioPeca01, valorUnitarioPeca02, somaTotal;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        codigoPeca01 = scanner.nextInt();
        numeroPecas01 = scanner.nextInt();
        valorUnitarioPeca01 = scanner.nextDouble();
        codigoPeca02 = scanner.nextInt();
        numeroPecas02 = scanner.nextInt();
        valorUnitarioPeca02 = scanner.nextDouble();

        scanner.close();

        double precoFinal01 = (numeroPecas01 * valorUnitarioPeca01);
        double precoFinal02 = (numeroPecas02 * valorUnitarioPeca02);
        somaTotal =(precoFinal01 + precoFinal02);

        System.out.printf(Locale.US,"VALOR A PAGAR: R$ %.2f%n", somaTotal);
    }
}
