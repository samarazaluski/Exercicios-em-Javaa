package teste;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        do{
            System.out.println("1 div");
            System.out.println("2 sub ");
            System.out.println("3 mult");
            System.out.println("4 div");
            System.out.println("operação");

             op = input.nextInt();
        }while (op <1 || op > 4);

        System.out.println("Fora do do-while");
    }
}
