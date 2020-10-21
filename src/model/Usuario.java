package model;

// import java.time.LocalDate;

public class Usuario {
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
			// TODO Auto-generated method stub
			System.out.println("Nome: " + this.nome);
			System.out.println("Sexo: " + this.sexo);
			System.out.println("Endere�o : " + this.endereco);
			System.out.println("Telefone : " + this.telefone);
			System.out.println("Data de nascimento : " + this.dataNascimento);
			System.out.println("CPF : " + this.cpf);
			System.out.println(" \n");
		}
}
