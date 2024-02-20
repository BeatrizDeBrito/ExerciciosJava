package curso_programacao;

import java.util.Scanner;

public class EstaoDentroDoIntervalo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int in = 0;
        int out = 0;

        for( int i = 0; N > i; i++){
            int valor = scanner.nextInt();
            if (valor >=10 && valor<=20) {
                in = in + 1;
            }else{
                out = out + 1;
            }
        }
        System.out.println(in + "in");
        System.out.println(out + "out");

        scanner.close();
    }
}
