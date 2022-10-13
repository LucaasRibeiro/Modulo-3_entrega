package crud;

import java.util.Scanner;

import dao.PermissoesDAO;
import modelo.Permissoes;

public class PermissoesCRUD {

	public static void main(String[] args) {
		
		PermissoesDAO permissaoDAO = new PermissoesDAO();
		
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;
		
		int id = 0;
		String tipo = "";
		
		do {
			System.out.println("--- CRUD Perissoes ---");
			System.out.println("1 - Cadastro de Permissoes");
			System.out.println("2 - Consulta de Permissoes");
			System.out.println("3 - Delete de Permissoes");
			System.out.println("4 - Atualizacao de Permissoes");
			System.out.println("5 - Buscar Permissao");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				//CREATE
				System.out.println("*CADASTRAR PERMISSÃO*");
				System.out.println("Digite o tipo: ");
				input.nextLine();
				tipo = input.nextLine();
				
				Permissoes permissao = new Permissoes();
				
				permissao.setTipo_permissao(tipo);
				
				permissaoDAO.save(permissao);
				
				System.out.println("\n*CADASTRADO*\n");
				break;
			case 2:
				//READ
				System.out.println("*CONSULTA PERMISSÃO*");
				for(Permissoes p: permissaoDAO.getPermissoes()) {
					System.out.println("Id: " + p.getId_permissao() + "Tipo: "+ p.getTipo_permissao());
				}
				
				System.out.println("*ENCERRADA*");
				break;
				
			case 3:
				//DELETE
				System.out.println("Passe o id da permissao: ");
				posicao = input.nextInt();
				
				permissaoDAO.deleteById(posicao);
				break;
			case 4:
				//UPDATE
				System.out.println("Digite o id da permissao: ");
				id = input.nextInt();
				System.out.println("Digite o novo tipo da permissao: ");
				tipo = input.next();
				
				Permissoes permissao1 = new Permissoes(id,tipo);
				permissaoDAO.update(permissao1);
				break;
			case 5:
				//BUSCA POR ID
				System.out.println("Passe o id da permissao: ");
				posicao = input.nextInt();
				input.nextLine();
				
				Permissoes permissao2 = permissaoDAO.getPermissaoById(posicao);
				
				System.out.println("Tipo da Permissao: " + permissao2.getTipo_permissao());
				break;
				default:
					System.out.println(opcao != 0 ? "\n Opção é invalida, " + "tente novamente.\n" : "");
					break;
			}
		}while (opcao != 0);
		input.close();

	}

}
