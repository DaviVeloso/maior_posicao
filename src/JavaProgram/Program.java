package JavaProgram;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o numero : ");
            vect[i] = sc.nextInt();
        }

        int valor = vect[0];
        int posisao = 0;
        for(int i = 1; i < n; i++){
            if(valor < vect[i]){
                valor = vect[i];
                posisao = i;
            }
        }

        System.out.println("Maior valor = " + valor);
        System.out.println("Posicao do maior valor = " + posisao);








    }
}
