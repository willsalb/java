package Arrays;

import java.util.Random;

/*Gere e imprima uma matriz M4X4 com valores aleatórios entre 0-9 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        /*Primeiro metodo de fechamento de colchetes representa uma linha e o segundo uma coluna.
         * Exemplo abaixo: 4 linhas e 4 colunas
         */
        int[][] M = new int[4][4];

        /*Entrando em uma linha da matrix */
        for(int i = 0; i < M.length; i++) {
            /*O "j" representa cada coluna da linha acima, o "j" vai ser percorrido até ser menor que o tamanho da linha que ele está percorrendo, no caso "i" */
            for (int j = 0; j < M.length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        /*Primeiro vai pegar a matrix geral e depois vai percorrer(por isso o foreach) por cada linha dessa matrix e sair pegando cada elemento dessa 
         * linha.
        */
        /*Pegando a linha */
        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            /*A coluna está representando o elemento que está na linha */
            for (int Elementocoluna : linha) {
                System.out.print(Elementocoluna + " ");
            }
            System.out.println();
        }
    }
}
