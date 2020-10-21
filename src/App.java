import java.util.Random;
import java.util.Scanner;

import model.Entrega;
import model.Entregador;
import model.Fornecedor;
import model.Produto;
import model.Usuario;

public class App {

	public static void main (String[]args) {
		int op = 0;
		Scanner scan = new Scanner(System.in);
		Usuario cliente = new Usuario();
		Fornecedor fornecedor = new Fornecedor();
		Produto produto = new Produto();
		Random identificacao = new Random();
		Entregador entregador = new Entregador(identificacao.nextInt(100));
		do {
			System.out.println("=================================");
			System.out.println("1 - cadastrar cliente");
			System.out.println("2 - cadastrar entregador");
			System.out.println("3 - cadastrar fornecedor");
			System.out.println("4 - cadastrar produto");
			System.out.println("5 - cadastrar entrega");
			System.out.println("0 - para sair");
			op = scan.nextInt();
			System.out.println("=================================");
			switch (op) {
				case 1:
					// cliente 
					setardDadosCliente(cliente);
					cliente.printarUsuario();
					break;
				case 2:
					// entregador
					
					setarDadosEntregador(entregador);
					entregador.printaEntregador();
					break;
				case 3:
					// fornecedor 
					setarDadosFornecedor(fornecedor);
					fornecedor.printarFornecedor();
					break;
				case 4:
					// produto
					setarDadosProdutos(produto);
					produto.printaProduto();
					break;
				case 5:
					// entrega
					Entrega entrega = criarEntrega(cliente, fornecedor, entregador, produto);
					entrega.printarEntrega();
					break;
				default:
					break;
			}
		} while (op !=0);
		
		
		
	
	
	}
	
	private static Entrega criarEntrega(Usuario _cliente, Fornecedor _fornecedor, Entregador _entregador, Produto _produto) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da entrega:");
		double valor = scan.nextDouble();
		Entrega entrega = new Entrega(_cliente,_fornecedor, _entregador, valor, _produto.getCodigo());
		// System.out.println(" \n");
		// scan.close();
		return entrega;
	}

	private static void setardDadosCliente(Usuario cliente) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do cliente:");
		cliente.setNome(scan.nextLine());
		System.out.println("Digite um endereco:");
		cliente.setEndereco(scan.nextLine());
		System.out.println("Digite o telefone:");
		cliente.setTelefone(scan.nextLine());
		System.out.println("Digite o cpf:");
		cliente.setCpf(scan.nextLine());
		System.out.println("Digite o data de nascimento:");
		cliente.setDataNascimento(scan.nextLine());
		// System.out.println(" \n");
		// scan.close();
	}

	public static void setarDadosEntregador(Entregador entregador) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do entregador:");
		entregador.setNome(scan.nextLine());
		System.out.println("Digite um endereco:");
		entregador.setEndereco(scan.nextLine());
		System.out.println("Digite o telefone:");
		entregador.setTelefone(scan.nextLine());
		System.out.println("Digite o cpf:");
		entregador.setCpf(scan.nextLine());
		System.out.println("Digite o data de nascimento:");
		entregador.setDataNascimento(scan.nextLine());
		System.out.println(" \n");
		// scan.close();
	}    


	public static void setarDadosProdutos(Produto produto) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do produto:");
		produto.setNome(scan.next());
		System.out.println("Digite o codigo:");
		produto.setCodigo(scan.nextLine());
		System.out.println("Digite o categoria:");
		produto.setCategoria(scan.nextLine());
		System.out.println("Digite o peso:");
		produto.setPeso(scan.nextDouble());
		System.out.println("Digite o modelo:");
		produto.setModelo(scan.nextLine());
		System.out.println("Digite o fabricante:");
		produto.setFabricante(scan.nextLine());
		System.out.println("Digite a altura:");
		produto.setDimensaoAltura(scan.nextDouble());
		System.out.println("Digite o comprimento:");
		produto.setDimensaoComprimento(scan.nextDouble());
		System.out.println("Digite a profundidade:");
		produto.setDimensaoProfundidade(scan.nextDouble());
		System.out.println(" \n");
		// scan.close();
	}
	public static void setarDadosFornecedor(Fornecedor fornecedor) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome da empresa:");
		fornecedor.setNomeEmpresa(scan.nextLine());
		System.out.println("Digite o cnpj:");
		fornecedor.setCnpj(scan.nextLine());
		System.out.println("Digite o endereco:");
		fornecedor.setEndereco(scan.nextLine());
		System.out.println("Digite o telefone:");
		fornecedor.setTelefone(scan.nextLine());
		System.out.println(" \n");
		// scan.close();
	}
}
