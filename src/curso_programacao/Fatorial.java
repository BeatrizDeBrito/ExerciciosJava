package curso_programacao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int N = scanner.nextInt();

        int fatorial = 1;
        for(int i = 1; i <= N ; i++){

           fatorial = fatorial * i;
        }

        System.out.println("O valor do fatorial de " + N + " é: "+ fatorial + "!");

        scanner.close();
    }
}
