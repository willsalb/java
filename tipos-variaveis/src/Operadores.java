public class Operadores {
    public static void main(String[] args) {
        // int numero = 5;

        // numero = - numero;

        // System.out.println(numero);

        // numero = numero * -1;

        // System.out.println(numero);

        // boolean var = true;

        // var = !var;
        // System.out.println(var);

        //Operador Ternário:
        // int a, b;

        // a = 5;
        // b = 6;

        // String resultado = a==b ? "Verdadeiro" : "falso";

        // System.out.println(resultado);

        //OBJ são aplicados em outra estrutura
        String nome1 = "will";
        String nome2 = new String("will");

        //Equals para comparação deo OBJ, compara conteúdos
        System.out.println(nome1.equals(nome2));

        int num1 = 1;
        int num2 = 2;

        boolean trueOrFalse = num1 == num2;

        System.out.println("É igual ?: " + trueOrFalse);

        trueOrFalse = num1 != num2;

        System.out.println("É diferente ?: " + trueOrFalse);

        trueOrFalse = num1 > num2;

        System.out.println("É maior ?: " + trueOrFalse);

    }
}
