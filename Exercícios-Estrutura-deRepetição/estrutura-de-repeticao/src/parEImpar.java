import java.util.Scanner;

/* Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e impares */

public class parEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNum;
        int num;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNum = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            num = scan.nextInt();

            //Se o resto da divisão do num por 2 for igual a 0, quer dizer que esse num é par.
            if(num % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNum);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade ímpar: " + quantImpares);

    }
}