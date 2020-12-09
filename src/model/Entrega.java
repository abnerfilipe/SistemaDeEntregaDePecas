package model;

public class Entrega {
    private Cliente cliente;
    private Fornecedor fornecedor;
    private Entregador entregador;
    private double valor;
    private Produto produto;
    
    
    public Entrega(Cliente cliente, Fornecedor fornecedor, Entregador entregador, double valor, Produto produto){
        this.cliente = cliente;
        this.fornecedor = fornecedor;
        this.entregador = entregador;
        this.valor = valor;
        this.produto = produto;
        this.entregador.setEntrega(this);
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
    public void printarEntrega() {
        System.out.println("========Ficha: Entrega=========");
        System.out.println("Cliente");
        this.getCliente().printarUsuario();
        System.out.println("Fornecedor");
        this.getFornecedor().printarFornecedor();
        System.out.println("Entregador: ");
        this.getEntregador().printaEntregador();
        System.out.println("Produto: ");
        this.getProduto().printaProduto();
		System.out.println("Valor da entrega: " + this.valor);
        System.out.println("=================================");
    }
}