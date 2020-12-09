package model;

public class Produto {
    private String codigo;
    private String nome;
    private String categoria;
    private double peso;
    private String fabricante;
    private String modelo;
    private double dimensaoAltura;
    private double dimensaoComprimento;
    private double dimensaoProfundidade;
    
    public Produto(){};
    public Produto(String codigo, String nome, String categoria, double peso, String fabricante, String modelo, double dimensaoAltura, double dimensaoComprimento, double dimensaoProfundidade){
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.peso = peso;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.dimensaoAltura = dimensaoAltura;
        this.dimensaoComprimento = dimensaoComprimento;
        this.dimensaoProfundidade = dimensaoProfundidade;
    }
    

    
    /**
     * @return String return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return int return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return String return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return String return the dimensaoAltura
     */
    public double getDimensaoAltura() {
        return dimensaoAltura;
    }

    /**
     * @param dimensaoAltura the dimensaoAltura to set
     */
    public void setDimensaoAltura(double dimensaoAltura) {
        this.dimensaoAltura = dimensaoAltura;
    }

    /**
     * @return String return the dimensaoComprimento
     */
    public double getDimensaoComprimento() {
        return dimensaoComprimento;
    }

    /**
     * @param dimensaoComprimento the dimensaoComprimento to set
     */
    public void setDimensaoComprimento(double dimensaoComprimento) {
        this.dimensaoComprimento = dimensaoComprimento;
    }

    /**
     * @return String return the dimensaoProfundidade
     */
    public double getDimensaoProfundidade() {
        return dimensaoProfundidade;
    }

    /**
     * @param dimensaoProfundidade the dimensaoProfundidade to set
     */
    public void setDimensaoProfundidade(double dimensaoProfundidade) {
        this.dimensaoProfundidade = dimensaoProfundidade;
    }
    public void printaProduto() {
        System.out.println("========Ficha: Produto=========");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("DimensaoAltura: " + this.getDimensaoAltura());
        System.out.println("DimensaoComprimento: " + this.getDimensaoComprimento());
        System.out.println("DimensaoProfundidade: " + this.getDimensaoProfundidade());
        System.out.println("=================================");
    }


}