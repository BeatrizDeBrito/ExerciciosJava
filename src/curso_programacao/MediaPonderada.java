package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();


        for (int i = 0; i < N; i++){

            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double mediaPonderada = (valor1 * 2.0 + valor2 * 3.0 + valor3 *5.0) / 10.0;

            System.out.printf("%.1f%n", mediaPonderada);

        }

        scanner.close();
    }
}