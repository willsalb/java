package edu.will.POO;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
    }
}
