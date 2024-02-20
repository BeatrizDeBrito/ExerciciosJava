package curso_programacao;

import java.util.Scanner;

public class MostraNumerosImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        for(int i = 1; X >= i ; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
            scanner.close();
    }
}
