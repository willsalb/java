public class calculadora {

    public static void soma(double x, double y) {
        double resultado = x + y;

        System.out.println("A soma entre" + x + " + " + y + " = " + resultado);
    }

    public static void sub(double x, double y) {
        double resultado = x - y;

        System.out.println("A substração entre " + x + " - " + y + " = " + resultado);
    }

    public static void mult(double x, double y) {
        double resultado = x * y;

        System.out.println("A multiplicação entre " + x + " X " + y + " = " + resultado);
    }

    public void divisao(double x, double y) {
        double resultado = x / y;

        System.out.println("A divisão entre " + x + " / " + y + " = " + resultado);
    }
}
