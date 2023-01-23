import java.util.Scanner;

/* Desenvolva um gerador de tabuada, gerando qualquer número inteiro entre 1 a 10. O usuário deve informar de quam numero ele deseja ver a tabuada. */

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        // }

        int count = 0;

        // do {
        //     count++;
        //     System.out.println(tabuada + " X " + count + " = " + (tabuada*count));

        // } while(count < 10);

        while(count < 10) {
            count++;
            System.out.println(tabuada + " X " + count + " = " + (tabuada*count));
        }
    }
}
