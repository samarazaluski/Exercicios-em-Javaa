package teste;

import java.util.Arrays;
import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número inteiro");

        int numero = input.nextInt();

        for (int i = 0; i <= 10; i++) {

            System.out.println(numero + "x" + i + "=" + (numero * i));

        }
    }
}

