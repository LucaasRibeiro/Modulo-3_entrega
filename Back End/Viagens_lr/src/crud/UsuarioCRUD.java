package crud;

import java.util.Scanner;

import dao.PermissoesDAO;
import dao.UsuarioDAO;
import modelo.Permissoes;
import modelo.Usuarios;

public class UsuarioCRUD {

	public UsuarioCRUD(int id, String nome, String email, String senha, Permissoes permissao) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		PermissoesDAO permissaoDAO = new PermissoesDAO();

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
			System.out.println("3 - Atualiza");
			System.out.println("4 - Deleta");
			System.out.println("0 - Sair");

			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("*Cadastrar Usuário*");
				System.out.println("Digite o nome: ");
				input.nextLine();
				nome = input.nextLine();
				System.out.println("Digite o email: ");
				email = input.nextLine();
				System.out.println("Digite a senha");
				senha = input.nextLine();
				System.out.println("Digite o id da permissao: ");
				id_permissao = input.nextInt();
				input.nextLine();

				Permissoes permissao = permissaoDAO.getPermissaoById(id_permissao);

				Usuarios usuario = new Usuarios(id, nome, email, senha, permissao);

				usuarioDAO.save(usuario);

				System.out.println("\n*Cadastrado*\n");
				break;
			case 2:
				// READ
				for (Usuarios u : usuarioDAO.getUsuarios()) {
					System.out.println("Id: " + u.getId_usuario() + "Nome: " + u.getNome_usuario() + "Email: "
							+ u.getEmail_usuario() + "Permissao: " + u.getPermissoes().getTipo_permissao());
				}
				System.out.println("\n*Consultou*\n");
				break;
			case 3:
				// UPDADTE
				System.out.println("Digite o id: ");
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

				Permissoes permissao1 = permissaoDAO.getPermissaoById(id_permissao);

				Usuarios usuario1 = new Usuarios(id, nome, email, senha, permissao1);

				usuarioDAO.update(usuario1);
				break;
			case 4:
				// DELETE
				System.out.println("Passe o id do usuario: ");
				posicao = input.nextInt();

				usuarioDAO.deleteById(posicao);
				break;
			default:
				System.out.println(opcao != 0 ? "\n Opção invalida, tente novamente." : "");
				break;
			}

		} while (opcao != 0);
		input.close();
	}

}
