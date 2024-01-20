package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ValorDaContaAPagar {
    public static void main(String[] args) {

        int codigo;
        int quantidade;
        double valorTotal;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        codigo = scanner.nextInt();
        quantidade = scanner.nextInt();
        scanner.close();

        if(codigo == 1){
            valorTotal = 4.00 * quantidade;
            System.out.printf(Locale.US,"Total: R$ %.2f%n", valorTotal);
        }
        else if(codigo == 2){
            valorTotal = 4.50 * quantidade;
            System.out.printf(Locale.US,"Total: R$ %.2f%n", valorTotal);
        }
        else if(codigo == 3){
            valorTotal = 5.00 * quantidade;
            System.out.printf(Locale.US,"Total: R$ %.2f%n", valorTotal);
        }
        else if(codigo == 4){
            valorTotal = 2.00 * quantidade;

            System.out.printf(Locale.US,"Total: R$ %.2f%n", valorTotal);
        }
        else if(codigo == 5){
            valorTotal = 1.50 * quantidade;
            System.out.printf(Locale.US,"Total: R$ %.2f%n", valorTotal);
        }
    }
}
