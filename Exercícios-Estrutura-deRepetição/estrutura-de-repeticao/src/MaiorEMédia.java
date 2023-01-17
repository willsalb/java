import java.util.Scanner;

/*Faça um programa que leia 5 número e informe o maior número e a média desses números. */

public class MaiorEMédia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num; int maior = 0; int soma = 0; int count = 0;

        do {
            System.out.println("Número: ");
            num = scan.nextInt();

            soma = soma + num;

            if(num > maior) maior = num;

            count = count + 1;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);
    }
}
