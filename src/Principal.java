import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// Criando Governantes

		Governante montante = new Governante("Montante", 5000, 4000, 20000, 0, 20000, 40000);
		Governante lenha = new Governante("Lenha", 500, 25000, 10000, 0, 0, 100000);
		Governante clareza = new Governante("Clareza", 200, 7000, 120000, 5000, 10000, 0);

		// lista de governantes
		ArrayList<Governante> governantes = new ArrayList<Governante>();
		governantes.add(montante);
		governantes.add(lenha);
		governantes.add(clareza);

		// intanciar a classe Solução
		Solucao s = new Solucao();
		System.out.println(s.getQtdetotal("ouro", governantes));
		System.out.println(s.getQtdetotal("madeira", governantes));
		System.out.println(s.getQtdetotal("agua", governantes));
		System.out.println(s.getQtdeFicarVivo("Montante", governantes));
		System.out.println(s.getQtdeFicarVivo("Lenha", governantes));
		System.out.println(s.getQtdeFicarVivo("Clareza", governantes));
	}

}
