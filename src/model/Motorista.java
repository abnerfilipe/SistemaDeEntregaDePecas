package model;

public interface Motorista {
    void cadastrarVeiculo(String placa);
    void cadastrarCNH(int CNH);
    void cadastrarCategoria(String categoria);
    int rodizioPlaca();
}