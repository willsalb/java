import java.util.Scanner;

/*Fazer um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo a sua idade.*/

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome; int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Parando o laço...");
    }
}
