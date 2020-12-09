package model;

import java.util.ArrayList;

public class Entregador extends Usuario implements Motorista{
	private int identificacao,CNH;
	private String categoria;
	Veiculo veiculo;
	private ArrayList<Entrega> entregas = new ArrayList<Entrega>();

	
	public Entregador(int identificacao) {
		super();
		this.identificacao = identificacao;
	};

	public Entregador(String _nome, String _sexo, String _endereco, String _telefone, String _dataNascimento,
			String _cpf, int identificacao) {
		super(_nome, _sexo, _endereco, _telefone, _dataNascimento, _cpf);
		this.identificacao = identificacao;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public void printaEntregador() {
		System.out.println("========Ficha: Entregador=========");
		super.printarUsuario();
		System.out.println("Identificacao: " + this.getIdentificacao());
		System.out.println("CNH: " + this.getCNH());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Veiculo: ");
		this.getVeiculo().printarVeiculo();
		System.out.println("==Entregas==");
		for (Entrega entrega : entregas) {
			entrega.printarEntrega();
		}
        System.out.println("=================================");
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public int getCNH() {
		return CNH;
	}

	public void setCNH(int CNH) {
		this.CNH = CNH;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	// Interface methods

	@Override
	public void cadastrarVeiculo(String placa, String classe) {
		Veiculo veiculo = new Veiculo(placa, classe, this);
		this.setVeiculo(veiculo);
	}

	@Override
	public void cadastrarCNH(int CNH) {
		this.setCNH(CNH);
	}

	@Override
	public void cadastrarCategoria(String categoria) {
		this.setCategoria(categoria);
	}

	public ArrayList<Entrega> getEntregas() {
		return entregas;
	}

	public void setEntrega(Entrega entrega) {
		this.entregas.add(entrega);
	}
}
