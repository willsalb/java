package Arrays;

import java.util.Scanner;

/*Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas*/
public class Consoantes {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] consoantes = new String[6];
    int quantidadeConso = 0;

    int count = 0;
    do {

        System.out.println("Letra: ");
        String letra = scan.next();

        /*Diferenciado se a letra é consoante ou vogal 
         * Metodo equalsIgnoreCase -> Pega a string e compara com a variavel "letra"
        */
        if(!(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u")) ) {
                consoantes[count] = letra;

                quantidadeConso++;
            }

            count++;

    } while(count < consoantes.length);

    /*Para cada elemento dentro do array imprima um elemento*/
    for ( String consoante : consoantes) {
        /*Se a consoante for diferente eu imprimo se for igual não imprimo  */
        if(consoante != null) {
            System.out.print(consoante);
        }
    }
 }   
}