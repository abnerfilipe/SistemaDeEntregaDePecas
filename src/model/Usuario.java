package model;

// import java.time.LocalDate;

public abstract class Usuario {
		private String nome;
		private String sexo;
		private String endereco;
		private String telefone;
		private String dataNascimento;
		private String cpf;
		
		public Usuario(){};
		public Usuario(String nome,String sexo,String endereco,String telefone,String dataNascimento,String cpf) {
			this.nome = nome;
			this.sexo = sexo;
			this.endereco = endereco;
			this.telefone = telefone;
			this.dataNascimento = dataNascimento;
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
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
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public void setCpf(String cpf){
			this.cpf = cpf;
		}
		public String getCpf() {
			return cpf;
		}
		
		public void printarUsuario() {
			System.out.println("========Ficha: Usuario=========");
			System.out.println("Nome: " + this.getNome());
			System.out.println("Sexo: " + this.getSexo());
			System.out.println("Endereco : " + this.getEndereco());
			System.out.println("Telefone : " + this.getTelefone());
			System.out.println("Data de nascimento : " + this.getDataNascimento());
			System.out.println("CPF : " + this.getCpf());
			System.out.println("=================================");
		}
}
