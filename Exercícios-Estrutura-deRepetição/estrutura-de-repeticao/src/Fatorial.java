import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário 
 * Fatorial, é quando é pego um número e decomponhe ele mutiplicando por exemplo 5!= 120: 5*4*3*2*1, fatorial de 3 = 3*2*1.
*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multi = 1;

        System.out.println(fatorial +"! = ");
        for(int i = fatorial; i >= 1; i--) {
            multi = multi * i;
        }
        System.out.println(multi);
    }
}
