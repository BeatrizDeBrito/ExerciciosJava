package curso_programacao;

import java.util.Scanner;

public class CalculoDiferencaProduto {
    public static void main(String[] args) {

        int A = 0, B = 0, C = 0, D = 0;





        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D =scanner.nextInt();

        int diferenca = ((A*B)-(C*D));

        scanner.close();

        System.out.println("DIFERENCA = " + diferenca);
    }
}
