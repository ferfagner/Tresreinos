import java.util.ArrayList;

public class Solucao {
	// metodo para questão a
	public int getQtdetotal(String recurso, ArrayList<Governante> governantes) {
		int resultado = 0;
		// testar tipo de recurso

		switch (recurso) {
		case "ouro":
			for (int i = 0; i < governantes.size(); i++) {
				resultado = resultado + governantes.get(i).getOuro();
			}
			return resultado;

		case "madeira":
			for (int j = 0; j < governantes.size(); j++) {
				resultado = resultado + governantes.get(j).getMadeira();
			}
			return resultado;
		case "agua":
			for (int i = 0; i < governantes.size(); i++) {
				resultado = resultado + governantes.get(i).getAgua();
			}
			return resultado;

		default:
			return resultado;
		}

	}

	// metodo questão b

	public String getQtdeFicarVivo(String nomeGovernante, ArrayList<Governante> governantes) {
		String resultado = "";

		for (int i = 0; i < governantes.size(); i++) {
			if (governantes.get(i).getNome().equals(nomeGovernante)) {
				resultado = "Pedido do governantes:" + nomeGovernante + "\n" + "Ouro:"
						+ governantes.get(i).getPedidoouro() + "\n" + "Madeira:" + governantes.get(i).getPedidomadeira()
						+ "\n" + "Agua:" + governantes.get(i).getPedidoagua();
			}
		}
		return resultado;
	}

}
