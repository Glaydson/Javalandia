package principal;

import java.time.LocalDate;
import java.util.ArrayList;

import contribuintes.Contribuinte;
import contribuintes.ContribuinteAutonomo;
import contribuintes.ContribuintePrivado;
import contribuintes.ContribuintePublico;
import persistencia.ContribuinteDAO;

public class CalculaBeneficios {

	public static void main(String[] args) {
		System.out.println("CRIAÇÃO DE CONTRIBUINTES");
		Contribuinte joao = new ContribuintePrivado("João da Silva", "001-X", LocalDate.of(2012, 4, 25), true, 0.11,
				5500);
		Contribuinte maria = new ContribuintePublico("Maria Cunha", "002-9", LocalDate.of(2011, 6, 30), true, 0.10,
				3000);
		Contribuinte pedro = new ContribuintePrivado("Pedro José", "003-5", LocalDate.of(2009, 10, 3), true, 0.10,
				1000);
		Contribuinte francisca = new ContribuintePublico("Francisca dos Santos", "004-2", LocalDate.of(2015, 5, 10),
				true, 0.10, 2500);
		Contribuinte fatima = new ContribuinteAutonomo("Fátima Pereira", "005-1", LocalDate.of(2009, 3, 10), true, 0.10,
				8000);

		ContribuinteDAO.salvar(joao);
		ContribuinteDAO.salvar(maria);
		ContribuinteDAO.salvar(pedro);
		ContribuinteDAO.salvar(francisca);
		ContribuinteDAO.salvar(fatima);

		ContribuinteDAO.remover(maria);

		System.out.println();

		System.out.println("IMPRIME OS CONTRIBUINTES");
		ArrayList<Contribuinte> todos = ContribuinteDAO.buscarTodos();
		for (Contribuinte c : todos) {
			System.out.println(c);
		}

		System.out.println();

		System.out.println("IMPRIME AS CONTRIBUIÇÕES MENSAIS DE CADA CONTRIBUINTE");
		for (Contribuinte c : todos) {
			c.imprimirContribuicaoMensal();
		}


	}

}
