package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {

        int idFuncionario;
        double horasTrabalhadas;
        double valorPorHora;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //aceita valor com ponto;

        idFuncionario = scanner.nextInt();
        horasTrabalhadas = scanner.nextDouble();
        valorPorHora = scanner.nextDouble();

        scanner.close();

        double salario = (horasTrabalhadas * valorPorHora);

        System.out.println("Number = " + idFuncionario);
        System.out.printf(Locale.US,"SALARY = U$ %.2f%n ", + salario);

    }
}
