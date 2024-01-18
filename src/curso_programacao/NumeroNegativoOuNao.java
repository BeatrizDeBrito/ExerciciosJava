package curso_programacao;

import java.util.Scanner;

public class NumeroNegativoOuNao {
    public static void main(String[] args) {
        int entrada;

        Scanner scanner = new Scanner(System.in);
        entrada = scanner.nextInt();
        scanner.close();

        if(entrada < 0 ){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NAO NEGATIVO");
        }
    }
}
