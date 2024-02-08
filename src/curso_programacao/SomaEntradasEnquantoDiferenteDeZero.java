package curso_programacao;

import java.util.Scanner;

public class SomaEntradasEnquantoDiferenteDeZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int entradaNumero = scanner.nextInt();
        int soma = 0;
        while (entradaNumero != 0) {
            soma += entradaNumero;
            entradaNumero = scanner.nextInt();
        }
        System.out.println(soma);

        scanner.close();
    }
}
