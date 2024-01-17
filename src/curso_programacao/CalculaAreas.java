package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreas {
    public static void main(String[] args) {

        float A, B, C;
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        A = scanner.nextFloat();
        B = scanner.nextFloat();
        C = scanner.nextFloat();

        scanner.close();

        float areaTrianguloRetangulo = (A * C) /2;
        System.out.printf(Locale.US,"TRIANGULO:  %.3f%n", areaTrianguloRetangulo);

        double areaCirculo = (pi * (C * C));
        System.out.printf(Locale.US,"CIRCULO:  %.3f%n", areaCirculo);




    }
}
