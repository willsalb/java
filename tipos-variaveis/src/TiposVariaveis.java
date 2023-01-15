public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 120;
        short ano = 2023;
        int cep = 52121200; // Se começar com zero, vai ter que ser de outro tipo
        long cpf = 71064137474L; // Se começar com zero, vai ter que ser de outro tipo
        float pi = 3.14F; // É necessario colocar um F no final do tipo float
        double salarioMinimo = 1300.50;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //Recurso casting = Pega um tipo mais abrangente e converte e converte para um tipo mais específico
        short numeroCurto2 = (short) numeroNormal;

        //Constante
        final double VALOR_DE_PI = 3.14;
    }
}
