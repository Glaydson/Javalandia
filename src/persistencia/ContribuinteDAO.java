package persistencia;

import java.util.ArrayList;

import contribuintes.Contribuinte;

public class ContribuinteDAO {

	// Define uma estrutura em memória para armazenamento de objetos Contribuinte
	private static ArrayList<Contribuinte> contribuintes = new ArrayList<>();

	public static void salvar(Contribuinte c) {
		contribuintes.add(c);
		System.out.printf("Contribuinte %s salvo com sucesso. Existem %d contribuintes no sistema%n", c.getNome(),
				contribuintes.size());
	}

	public static void remover(Contribuinte c) {
		if (contribuintes.contains(c)) {
			contribuintes.remove(c);
			System.out.printf("Contribuinte %s removido com sucesso. Existem %d contribuintes no sistema%n",
					c.getNome(), contribuintes.size());
		} else {
			System.out.printf("Contribuinte %s não encontrado%n", c.getNome());
		}
	}
	
	public static ArrayList<Contribuinte> buscarTodos() {
		return contribuintes;
	}
}
