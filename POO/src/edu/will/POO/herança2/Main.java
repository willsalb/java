package edu.will.POO.herança2;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //3 upcast, sendo implicito no caso genrete está dizendo que é um funcionario.
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
