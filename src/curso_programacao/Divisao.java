package curso_programacao;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de entradas: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Digite o primeiro número: ");
            int numerador = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int denominador = scanner.nextInt();

            if (denominador != 0){
                int resultado = numerador / denominador;
                System.out.println("Resultado da divisão: " + resultado);
            }
            else{
                System.out.println("Divisão impossível!");
            }
        }
        scanner.close();



    }
}
