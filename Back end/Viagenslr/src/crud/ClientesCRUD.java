package crud;

import java.util.Scanner;

import dao.ClienteDAO;
import dao.PermissoesDAO;
import dao.UsuarioDAO;
import modelo.Clientes;

public class ClientesCRUD {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		PermissoesDAO permissoesdao = new PermissoesDAO();
		UsuarioDAO usuariodao = new UsuarioDAO();
		
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		int posicao = 0;
		
		//nome_cliente ,cpf_cliente , rg_cliente , email_cliente , senha_cliente , telefone_cliente , 
		//rua_cliente , numero_cliente , cep_cliente , bairro_cliente , cidade_cliente , estado_cliente ,país_cliente
		int id = 0;
		String nome = "";
		String cpf = "";
		String rg = "";
		String email = "";
		String senha = "";
		String telefone = "";
		String rua = "";
		String numero = "";
		String cep = "";
		String bairro = "";
		String cidade = "";
		String estado = "";
		String pais = "";
		
		do {
			System.out.println("*CRUD Cliente*");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Deletar");
			System.out.println("0 - Sair");

			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				//create
				System.out.println("*CADASTRAR USUARIO*");
				System.out.println("Digite o nome do usuario: ");
				input.nextLine();
				nome = input.nextLine();
				System.out.println("Digite o cpf: ");
				cpf = input.nextLine();
				System.out.println("Digite seu email: ");
				email = input.nextLine();
				System.out.println("Digite sua senha: ");
				senha = input.nextLine();
				
				Clientes cliente = clienteDAO.getClientesById(id_cliente);
				Permissoes permissao = permissoesDAO.getPermissoesById(id_permissao);
				
				clienteDAO.save(cliente);
				
				System.out.println("\n *Cadastrado*");
				break;
			case 2:
				//read
				for (Clientes 1 : clienteDAO.getClientes()) {

					//nome_cliente ,cpf_cliente , rg_cliente , email_cliente , senha_cliente , telefone_cliente , 
					//rua_cliente , numero_cliente , cep_cliente , bairro_cliente , cidade_cliente , estado_cliente ,país_cliente
					System.out.println("id:" + 1.getId_cliente() + "Nome: " + 1.getNome_cliente() + "Cpf :" + 1.getCpf_cliente() + "Email: " + 1.getEmail_cliente() + "Senha: " + 1.getSenha_cliente())
				}
				System.out.println("\nConsulta Finalizada.");
				break;
			case 3:
				//delete
				System.out.println("Digite o id: ");
				posicao = input.nextInt();
				
				clienteDAO.deleteById(posicao);
				break;
			case 4:
				System.out.println("Digite o nome do usuario: ");
				input.nextLine();
				nome = input.nextLine();
				System.out.println("Digite o cpf: ");
				cpf = input.nextLine();
				System.out.println("Digite seu email: ");
				email = input.nextLine();
				System.out.println("Digite sua senha: ");
				senha = input.nextLine();			
				
				Clientes cliente = clienteDAO.getClientesById(id_cliente);
				Permissoes permissao = permissoesDAO.getPermissoesById(id_permissao);
				
				clienteDAO.update(cliente);
				break;
				default;
				System.out.println(opcao !=0 ? "\n Opção invalida, tente novamente." : "");
				break;
			}
			
		}while (opcao != 0);
		input.close();

		

	}
}
