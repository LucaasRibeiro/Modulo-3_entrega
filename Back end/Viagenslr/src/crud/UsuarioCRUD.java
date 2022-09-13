package crud;

import java.util.Scanner;

import dao.PermissoesDAO;
import dao.UsuarioDAO;
import modelo.Permissoes;
import modelo.Usuarios;

public class UsuarioCRUD {

	public static void main(String[] args) {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		PermissoesDAO permissoesDAO = new PermissoesDAO();

		Scanner input = new Scanner(System.in);

		int opcao = 0;
		int posicao = 0;

		int id = 0;
		String nome = "";
		String email = "";
		String senha = "";
		int id_permissao = 0;

		do {
			System.out.println("*CRUD USUARIO*");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Deletar");
			System.out.println("0 - Sair");

			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("*Cadastrar Usuario*");
				System.out.println("Digite o nome: ");
				input.nextLine();
				System.out.println("Digite o email: ");
				email = input.nextLine();
				System.out.println("Digite a senha: ");
				senha = input.nextLine();
				System.out.println("Digite o id da permissão: ");
				id_permissao = input.nextInt();
				input.nextLine();

				Permissoes permissao = permissoesDAO.getPermissaoById(id_permissao);

				Usuarios usuario = new Usuarios(id, email, senha, permissao);

				usuarioDAO.save(usuario);

				System.out.println("\n*CAdastrado*\n");
				break;
			case 2:
				// READ
				for (Usuarios u : usuarioDAO.getUsuarios()) {
					System.out.println("Id: " + u.getId_usuario() + "login: " + u.getLogin_usuario() + "Email: "
							+ u.getEmail_usuario() + "Permissão: " + u.getPermissoes());
				}
				System.out.println("\n*COnsultou*\n");
				break;
			case 3:
				// UPDATE
				System.out.println("Digite o id do usuario: ");
				id = input.nextInt();
				input.nextLine();
				System.out.println("Digite o nome: ");
				nome = input.nextLine();
				System.out.println("Digite o email: ");
				email = input.nextLine();
				System.out.println("Digite a senha: ");
				senha = input.nextLine();
				System.out.println("Digite o id da permissão: ");
				id_permissao = input.nextInt();
				input.nextLine();

				Permissoes permissao1 = permissoesDAO.getPermissaoById(id_permissao);
				Usuarios usuario1 = new Usuarios(id, nome, email, senha, permissao1);

				usuarioDAO.update(usuario1);
				break;
			case 4:
				// DELETE
				System.out.println("Passe p id do Usuario: ");
				posicao = input.nextInt();

				usuarioDAO.deleteById(posicao);
				break;
			default:
				System.out.println(opcao != 0 ? "\n Opção inválida, tente novamente." : "");
				break;
			}
		} while (opcao != 0);
		input.close();

	}

}
