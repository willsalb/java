package Arrays;

import java.util.Random;

/*Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os em um vetor. Ao final mostre os números e seu sucessores. */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int num =random.nextInt(100);
            numerosAleatorios[i] =num;
        }

        System.out.println("Numeros aleatorios: ");
        for (int num : numerosAleatorios) {
            System.out.print(num + " ");
        }

        System.out.println("\n Sucessores: ");
        for (int num : numerosAleatorios) {
            System.out.print((num+1) + " ");
        }
    }
}
