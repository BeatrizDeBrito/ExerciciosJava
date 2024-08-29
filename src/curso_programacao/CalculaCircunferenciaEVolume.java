package curso_programacao;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

import static util.Calculator.*;

public class CalculaCircunferenciaEVolume {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter radius");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.println("Circumference = " + c);
        System.out.println("Volume = " + v);
        System.out.println(calc.PI);

        sc.close();
    }
}
