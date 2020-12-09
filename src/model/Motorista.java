package model;

public interface Motorista {
    void cadastrarVeiculo(String placa, String classe);
    void cadastrarCNH(int CNH);
    void cadastrarCategoria(String categoria);
}