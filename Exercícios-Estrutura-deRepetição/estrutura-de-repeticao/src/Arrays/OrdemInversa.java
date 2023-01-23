package Arrays;

/* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-4,-5,15,50,8,4};

        int count = 0;

        while(count < (vetor.length)) {
            System.out.println(vetor[count]);
            count++;
        }

        /*A posição do vetor vai ser o tamanho dele menos 1 vai ser 5 no caso pq o vetor é de 6 posições */
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}