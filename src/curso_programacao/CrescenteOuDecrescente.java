package curso_programacao;

import java.util.Scanner;

public class CrescenteOuDecrescente {
    public static void main(String[] args) {

        int X, Y;

        Scanner scanner = new Scanner(System.in);
        X = scanner.nextInt();
        Y = scanner.nextInt();

        while( X != Y ) {
            if(X > Y){
                System.out.println("Decrescente");
            } else{
                System.out.println("Crescente!");
            }
            X = scanner.nextInt();
            Y = scanner.nextInt();
        }
        }

}
