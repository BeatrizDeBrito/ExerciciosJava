package curso_programacao;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        int A, B;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        scanner.close();

        if (A > B || B > A){
            if( A % B == 0){
                System.out.println("Sao Multiplos");
            } else{
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}
