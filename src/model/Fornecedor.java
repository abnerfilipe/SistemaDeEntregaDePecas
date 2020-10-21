package model;

public class Fornecedor {
	
	private String cnpj;
	private String nomeEmpresa;
	private String endereco;
	private String telefone;
	
	public Fornecedor(){};
	public Fornecedor(String cnpj, String nomeEmpresa, String endereco, String telefone) {
		this.cnpj = cnpj;
		this.nomeEmpresa = nomeEmpresa;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void printarFornecedor() {
		System.out.println("Fornecedor: " + this.nomeEmpresa);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Endere�o: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
	}
	

	
}
