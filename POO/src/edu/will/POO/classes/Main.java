package edu.will.POO.classes;

import edu.will.POO.classes.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.SetModelo("BMW");
        carro1.capacidadeTanque(59);

        System.out.println(carro1.getModelo());
    }
}
