package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class IntervaloDeNumeros {
    public static void main(String[] args) {
        double entradaNumero;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        entradaNumero = scanner.nextDouble();
        scanner.close();

        if (entradaNumero < 0.0 || entradaNumero > 100.0) {
            System.out.println("Fora de intervalo");
        }
        if(entradaNumero <= 25.00 ){
            System.out.println("Intervalor [0,25]");
        }
        else if(entradaNumero <= 50.0 ){
            System.out.println("Intervalor [25,50]");
        }
        else if(entradaNumero <= 75.0 ){
            System.out.println("Intervalor [50, 75]");
        }
        else{
            System.out.println("Intervalo (75,100]");
        }
    }
}

