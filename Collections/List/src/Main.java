import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:

        //List notas = new ArrayList(); //Antes do java 5
        //ArrayList<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5)
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);
        notas.add(8.5);
        notas.add(7.3);
        notas.add(5.5);

        System.out.println(notas.toString());

        System.out.println("Exibir a posição da nota 10.0: " + notas.indexOf(10.0));

        System.out.println("Adicionando na lista a nota 5.5 na posição 4: ");
        notas.add(4, 5.5);

        System.out.println("Substituir a nota 5.5 pela nota 8.5: ");
        notas.set(notas.indexOf(5.5), 8.5);

        System.out.println("Confira se a nota 5.5 está na lista" + notas.contains(5.5));

        System.out.println("Exibir todas as notas na ordem em que foram informadas: ");
        for(Double nota : notas) System.out.println(nota);
    }
}