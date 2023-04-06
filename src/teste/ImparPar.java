package teste;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Antes de for");

        System.out.println("inicio");
        int inicio = input.nextInt();
        System.out.println("Fim");
        int fim = input.nextInt();

        for (int i = inicio; i <fim; i++){
            if (i% 2 ==0){
                System.out.println("É par:" + i);
            } else {
                System.out.println("É impar:" + i);
            }
        }
        System.out.println("Depois de for");

    }

}
