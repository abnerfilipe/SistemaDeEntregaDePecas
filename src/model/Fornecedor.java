package model;

import java.util.ArrayList;

public class Fornecedor {
	
	private String cnpj;
	private String nomeEmpresa;
	private String endereco;
	private String telefone;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
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

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProduto(Produto produto) {
		this.produtos.add(produto);
	}

	public void printarFornecedor() {
		System.out.println("========Ficha: Fornecedor=========");
		System.out.println("Fornecedor: " + this.nomeEmpresa);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
		for (Produto produto : produtos) {
			produto.printaProduto();
		}
        System.out.println("=================================");
	}

	
}
