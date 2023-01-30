public class Main {
    public static void main(String[] args) {
        //Quadrilátero
        System.out.println("Exercício quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(10,10);
        System.out.println("Área: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(5,8,20);
        System.out.println("Área: " + areaTrapezio);
    }
}
