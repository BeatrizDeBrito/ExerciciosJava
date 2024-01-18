package curso_programacao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int entrada;

        Scanner scanner = new Scanner(System.in);

        entrada = scanner.nextInt();
        scanner.close();

        if(entrada < 0){
            System.out.println("IMPAR");
        }else {
            System.out.println("PAR");
        }
    }
}
