package model;

public class Entrega {
    private Usuario usuario;
    private Fornecedor fornecedor;
    private Entregador entregador;
    private double valor;
    private String codigoProduto;
    
    
    public Entrega(Usuario usuario, Fornecedor fornecedor, Entregador entregador, double valor, String codigoProduto){
        this.usuario = usuario;
        this.fornecedor = fornecedor;
        this.entregador = entregador;
        this.valor = valor;
        this.codigoProduto = codigoProduto;
    }

    

    /**
     * @return Usuario return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return Fornecedor return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return double return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return String return the codigoProduto
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }


    public void printarEntrega() {
		System.out.println("Usuario: " + this.usuario.getNome());
		System.out.println("Fornecedor: " + this.fornecedor.getNomeEmpresa());
		System.out.println("Entregador: " + this.entregador.getNome());
		System.out.println("Valor: " + this.valor);
		System.out.println("Codigo do Produto: " + this.codigoProduto);
    }


}