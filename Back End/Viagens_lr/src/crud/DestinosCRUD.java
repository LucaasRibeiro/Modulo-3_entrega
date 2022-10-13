package crud;

import java.util.Scanner;

import dao.DestinosDAO;
import modelo.Destinos;

public class DestinosCRUD {

	public static void main(String[] args) {

		DestinosDAO destinoDAO = new DestinosDAO();
		Scanner input = new Scanner(System.in);

		int opcao = 0;
		int posicao = 0;

		int id = 0;
		String nome = "";
		
		
		do {
			System.out.println("--- CRUD Destino ---");
			System.out.println("1 - Cadastro de Destino");
			System.out.println("2 - Consulta de Destino");
			System.out.println("3 - Delete de Destino");
			System.out.println("4 - Atualizacao de Destino");
			System.out.println("5 - Buscar Destino");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				//CREATE
				System.out.println("*CADASTRO DE DESTINO*");
				System.out.print("Nome do destino: ");
				input.nextLine();
				nome = input.nextLine();
				
				Destinos destino = new Destinos();
				destino.setNome_destino(nome);
				
				destinoDAO.save(destino);
				
				System.out.println("\n*CADASTRADO*\n");
				break;
				
			case 2:
				//READ
				System.out.println("*CONSULTA DE DESTINOS*");
				for (Destinos d : destinoDAO.getDestinos()) {
					System.out.println("Id: " + d.getId_destino() + "Nome: " + d.getNome_destino());
						}
				System.out.println("\n*CONSULTA FINALIZADA*");
				break;
			case 3:
				//DELETE
				System.out.println("Digite o id: ");
				posicao = input.nextInt();
				
				destinoDAO.deleteById(posicao);
				break;
				
			case 4:
				//UPDATE
				System.out.println("Digite o id: ");
				id = input.nextInt();
				input.nextLine();
				System.out.println("Digite um novo nome: ");
				nome = input.nextLine();
				
				Destinos destino1 = new Destinos(id,nome);
				destinoDAO.update(destino1);
				break;
				
			case 5:
				//READ BY ID
				System.out.println("Digite o id: ");
				posicao = input.nextInt();
				input.nextLine();
				
				Destinos destino2 = destinoDAO.getDestinosById(posicao);
				
				System.out.println(destino2.toString());
				break;
				default:
					System.out.println(opcao != 0 ? "\n Opção Invalida, tente novamente." : "");				
			}
         }while (opcao !=0);
		input.close();
      }
}