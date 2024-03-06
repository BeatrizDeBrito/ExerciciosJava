package curso_programacao;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char resposta;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double temperatura = scanner.nextDouble();
            double F = (9.0 * temperatura / 5.0 + 32.0);

            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'n');

        scanner.close();



    }
}
