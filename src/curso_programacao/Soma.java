package curso_programacao;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double resultado = (double)a / (double)b;
        System.out.println(resultado);

        Scanner scanner = new Scanner(System.in);

        int primeiraEntrada;
        int segundaEntrada;

        primeiraEntrada = scanner.nextInt();
        segundaEntrada = scanner.nextInt();

        System.out.println("Soma = " + (primeiraEntrada + segundaEntrada));

        scanner.close();

    }



}
