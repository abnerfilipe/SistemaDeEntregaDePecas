package model;

public class Cliente extends Usuario {

    public Cliente(String nome, String sexo, String endereco, String telefone, String dataNascimento, String cpf) {
        super(nome, sexo, endereco, telefone, dataNascimento, cpf);
    }

    @Override
    public void printarUsuario() {
        // super.printarUsuario();
        System.out.println("========Ficha: Cliente=========");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Endereco : " + this.getEndereco());
        System.out.println("Telefone : " + this.getTelefone());
        System.out.println("Data de nascimento : " + this.getDataNascimento());
        System.out.println("CPF : " + this.getCpf());
        System.out.println("=================================");
    }

    
}
