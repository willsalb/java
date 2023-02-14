package edu.will.POO.polimorfismoEsobrescrita;

class Main {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //Dois comportamento polimorficos da classes filha 1 e 2 e nenhum comportamento na classeMae
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        //No primeiro comportamento ele não vai acontecer o polimorfismo, já no segundo vai ter porque ele foi sobrescrito e no ultimo ele não tem porque é a propria classe
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
