import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Cliente;
import model.Entrega;
import model.Entregador;
import model.Fornecedor;
import model.Produto;
import model.Veiculo;

public class App {

	public static void main (String[]args) {
		int op = 0;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		// Persistencia em tempo de execucao
		ArrayList<Cliente> clientesList = new ArrayList<Cliente>();
		ArrayList<Entregador> entregadoresList = new ArrayList<Entregador>();
		ArrayList<Fornecedor> fornecedoresList = new ArrayList<Fornecedor>();
		ArrayList<Produto> produtosList = new ArrayList<Produto>();
		ArrayList<Entrega> entregaList = new ArrayList<Entrega>();

		do {
			System.out.println("=================================");
			System.out.println("1 - cadastrar cliente");
			System.out.println("2 - listar clientes");
			System.out.println("3 - cadastrar entregador");
			System.out.println("4 - listar entregadores");
			System.out.println("5 - cadastrar fornecedor");
			System.out.println("6 - listar fornecedores");
			System.out.println("7 - cadastrar produto");
			System.out.println("8 - listar produtos");
			System.out.println("9 - cadastrar entrega");
			System.out.println("10 - listar entregas");
			System.out.println("0 - para sair");
			op = scan.nextInt();
			System.out.println("=================================");
			switch (op) {
				case 1:
					// cliente 
					System.out.println("=================================");
					Cliente cliente = new Cliente(null, null, null, null, null, null);
					System.out.println("Digite o cpf:");
					cliente.setCpf(scan.next());
					System.out.println("Digite o nome do cliente:");
					cliente.setNome(scan.next());
					System.out.println("Digite um endereco:");
					cliente.setEndereco(scan.next());
					System.out.println("Digite o telefone:");
					cliente.setTelefone(scan.next());
					System.out.println("Digite o data de nascimento:");
					cliente.setDataNascimento(scan.next());
					clientesList.add(cliente);
					cliente.printarUsuario();
					break;
				case 2:
					System.out.println("listar clientes");
					for (Cliente item : clientesList) {
						item.printarUsuario();
					}
					break;
				case 3:
					// entregador
					System.out.println("=================================");
					Entregador entregador = new Entregador(null, null, null, null, null, null, random.nextInt(100));
					System.out.println("Digite o nome do entregador:");
					entregador.setNome(scan.next());
					System.out.println("Digite um endereco:");
					entregador.setEndereco(scan.next());
					System.out.println("Digite o telefone:");
					entregador.setTelefone(scan.next());
					System.out.println("Digite o cpf:");
					entregador.setCpf(scan.next());
					System.out.println("Digite o dat1a de nascimento:");
					entregador.setDataNascimento(scan.next());
					System.out.println("=================================");
					System.out.println("E obrigatorio o cadastro de um veiculo ");
					Veiculo veiculo = new Veiculo(null, null, entregador);
					entregador.setVeiculo(veiculo);
					System.out.println("Digite o nome do Veiculo:");
					veiculo.setNome(scan.next());
					System.out.println("Digite a placa do Veiculo:");
					veiculo.setPlaca(scan.next());
					System.out.println("Digite a classe do Veiculo:(carro, moto, van)");
					veiculo.setClasse(scan.next());
					entregadoresList.add(entregador);
					veiculo.printarVeiculo();
					entregador.printaEntregador();
					break;
				case 4:
					System.out.println("listar entregadores");

					for (Entregador item : entregadoresList) {
						item.printaEntregador();
					}
					break;
				case 5:
					// fornecedor 
					System.out.println("=================================");
					Fornecedor fornecedor = new Fornecedor(null,null,null,null);
					System.out.println("Digite o nome da empresa:");
					fornecedor.setNomeEmpresa(scan.next());
					System.out.println("Digite o cnpj:");
					fornecedor.setCnpj(scan.next());
					System.out.println("Digite o endereco:");
					fornecedor.setEndereco(scan.next());
					System.out.println("Digite o telefone:");
					fornecedor.setTelefone(scan.next());
					fornecedoresList.add(fornecedor);
					fornecedor.printarFornecedor();
					break;
				case 6:
					System.out.println("listar fornecedores");
					for (Fornecedor item : fornecedoresList) {
						item.printarFornecedor();
					}
					break;
				case 7:
					// produto
					System.out.println("=================================");
					var produto = new Produto(null, null, null, 0.0, null, null, 0.0, 0.0, 0.0);
					System.out.println("Digite o nome do produto:");
					produto.setNome(scan.next());
					System.out.println("Digite o codigo:");
					produto.setCodigo(scan.next());
					System.out.println("Digite o categoria:");
					produto.setCategoria(scan.next());
					System.out.println("Digite o peso:");
					produto.setPeso(scan.nextDouble());
					System.out.println("Digite o modelo:");
					produto.setModelo(scan.next());
					System.out.println("Digite o fabricante:");
					produto.setFabricante(scan.next());
					System.out.println("Digite a altura:");
					produto.setDimensaoAltura(scan.nextDouble());
					System.out.println("Digite o comprimento:");
					produto.setDimensaoComprimento(scan.nextDouble());
					System.out.println("Digite a profundidade:");
					produto.setDimensaoProfundidade(scan.nextDouble());
					produtosList.add(produto);
					produto.printaProduto();
					break;
				case 8:
					System.out.println("listar produtos");
					for (Produto item : produtosList) {
						item.printaProduto();
					}

					break;
				case 9:
					// entrega
					System.out.println("=================================");
					try {
						System.out.println("Digite o nome do cliente:");
						String a = scan.next();
						int clienteIndex = -1;
							for (Cliente item : clientesList){
								if(item.getNome() != a){
									System.out.println("Nome do cliente esta incorreto ou ele nao esta cadastrado!");
									break;
								}else{
									clienteIndex = clientesList.indexOf(item);;
								}
							}
						System.out.println("Digite o nome do fornecedor:");
						String b = scan.next();
						int fornecedorIndex = -1;
							for (Fornecedor item : fornecedoresList){
								if(item.getNomeEmpresa() != b){
									System.out.println("Nome do fornecedor esta incorreto ou ele nao esta cadastrado!");
									break;
								}else{
									fornecedorIndex = fornecedoresList.indexOf(item);
								}
							}
						System.out.println("Digite o codigo do entregador:");
						int c = scan.nextInt();
						int entregadorIndex = -1;
							for (Entregador item : entregadoresList){
								if(item.getIdentificacao() != c){
									System.out.println("O codigo do entregador esta incorreto ou ele nao esta cadastrado!");
									break;
								}else{
									entregadorIndex = entregadoresList.indexOf(item);
								}
							}
						System.out.println("Digite o codigo do produto:");
						String d = scan.next();
						int ProdIndex = -1;
							for (Produto item : produtosList){
								if(item.getCodigo() != d){
									System.out.println("O codigo do produto esta incorreto ou ele nao esta cadastrado!");
									break;
								}else{
									ProdIndex = produtosList.indexOf(item);
								}
							}
						System.out.println("Digite o valor da entrega:");
						double valor = scan.nextDouble();
						Entrega entrega = new Entrega(clientesList.get(clienteIndex), fornecedoresList.get(fornecedorIndex), entregadoresList.get(entregadorIndex), valor, produtosList.get(ProdIndex));
						entrega.printarEntrega();
						entregaList.add(entrega);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						break;
					}
				case 10:
					System.out.println("listar entregas");
					for (Entrega item : entregaList) {
						item.printarEntrega();
					}
					break;
				default:
					break;
			}
		} while (op !=0);
	}
}
