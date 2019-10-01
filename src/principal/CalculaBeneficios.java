package principal;

import java.time.LocalDate;
import java.util.ArrayList;

import contribuintes.Contribuinte;
import persistencia.ContribuinteDAO;

public class CalculaBeneficios {

	public static void main(String[] args) {
		Contribuinte joao = new Contribuinte("João da Silva", "001-X", LocalDate.of(2012, 4, 25), true, 0.11, 5500);
		Contribuinte maria = new Contribuinte("Maria Cunha", "002-9", LocalDate.of(2011, 6, 30), true, 0.10, 3000);
		Contribuinte manoel = new Contribuinte ("Manoel José", "003-4", LocalDate.of(1978,  06, 30), false, 0.08, 1500);
		
		ContribuinteDAO.salvar(joao);
		ContribuinteDAO.salvar(maria);
		ContribuinteDAO.salvar(manoel);
		
		ContribuinteDAO.remover(joao);
		ContribuinteDAO.remover(joao);
		
		System.out.println();
		
		ArrayList<Contribuinte> todos = ContribuinteDAO.buscarTodos();
		for (Contribuinte c : todos) {
			System.out.println(c);
		}
//		joao.imprimirContribuicaoMensal();
//		maria.imprimirContribuicaoMensal();
//		manoel.imprimirContribuicaoMensal();

	}

}
