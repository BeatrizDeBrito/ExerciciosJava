package curso_programacao;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class CalculaCircunferenciaEVolume {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.println("Circumference = " + c);
        System.out.println("Volume = " + v);
        System.out.println(Calculator.PI);

        sc.close();
    }
}
