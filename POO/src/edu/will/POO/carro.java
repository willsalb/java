package edu.will.POO;

class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    /*
    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }*/


    //Set -> É usado para setar um valor em um atributo;
    void setCor(String cor) {
        this.cor = cor;
    }

    //Get -> Retorna algo;
    String getCor() {
        return cor;
    }

    void SetModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void capacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getcapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}
