package model;

public class Veiculo {
    String nome, placa,classe;
    Entregador entregador;

    public Veiculo(String placa, String classe,Entregador entregador) {
        this.placa = placa;
        this.classe = classe;
        this.entregador = entregador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
    public void printarVeiculo() {
        System.out.println("========Ficha: Veiculo=========");
		System.out.println("Nome do veiculo: " + this.getNome());
        System.out.println("Placa: " + this.getPlaca());
		System.out.println("Classe: " + this.getClasse());
        System.out.println("Entregador: " + this.entregador.getNome());
        System.out.println("=================================");
    }
    
}
