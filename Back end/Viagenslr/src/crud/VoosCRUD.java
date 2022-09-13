package crud;

import java.util.Scanner;

import dao.VoosDAO;
import modelo.Voos;

public class VoosCRUD {

	public static void main(String[] args) {
		//id_voo, origem_voo, destino_voo, dataIda_voo, dataVolta_voo
		
		VoosDAO vooDAO = new VoosDAO();
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		int posicao = 0;
		
		int id = 0;
		String origem = 0;
		String destino = 0;
		String  dataIda = 0;
		String dataVolta = 0;
		
		do {
			System.out.println("---CRUD Voos---");
			System.out.println("1 - CADASTRO DE Voo");
			System.out.println("2 - CONSULTA DE Voo");
			System.out.println("3 - DELETE DE Voo");
			System.out.println("4 - ATUALIZAR Voo");
			System.out.println("5 - BUSCAR Voo");
			System.out.println("0 - SAIR");
			
			opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				//create
				System.out.println("*Cadastro de Voo*");
				System.out.println("ID VOO");
				input.nextLine();
				id = input.nextLine();
				
				Voos voo = new Voos();
				Voo.setId_voo(id);
				System.out.println("\n*CADASTRADO*\n");
				break;
			case 2:
				//read
				System.out.println("*CONSULTA DE VOOS");
				for (Voos v : vooDAO.getVoos()) {
					System.out.println("Id: " + v.getId_voo() + "Destino: " + v.getDestino_voo() );
				}
				System.out.println("\n*CONSULTA FINALIZADA*");
				break;
			}
			case 3:
				//delete
				System.out.println("Digite o id: ");
				posicao = input.nextInt();
				
				vooDAO.deleteById(posicao);
				break;
			case 4:
				//update
				System.out.println("Digite o id: ");
				id = input.nextInt();
				input.nextLine();
				System.out.println("Digite o destino: ");
				destino = input.next();
				
				Voos voo1 = new Voos(id,destino);
				vooDAO.update(voo1);
			case 5:
				//read by id
				System.out.println("Digite o id: ");
				posicao = input.nextInt();
				input.nextLine();
				
				Voos voo2 = vooDAO.getVoosById(posicao);
				System.out.println(voo2.toString());
				break;
				default:
					System.out.println(opcao != 0 ? "\n Opcao Invalida, tente novamente." : "");
					break;
		} 

	}while (opcao != 0);

}
