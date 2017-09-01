
public class Governante {

	private String nome;
	private int ouro;
	private int madeira;
	private int agua;

	private int pedidoouro;
	private int pedidomadeira;
	private int pedidoagua;

	// tostring

	// contrutor
	public Governante(String nome, int ouro, int madeira, int agua, int pedidoOuro, int pedidoMadeira, int pedidoAgua) {
		this.nome = nome;
		this.ouro = ouro;
		this.madeira = madeira;
		this.agua = agua;
		this.pedidoouro = pedidoOuro;
		this.pedidomadeira = pedidoMadeira;
		this.pedidoagua = pedidoAgua;
	}

	// gat and set

	public String getNome() {
		return nome;
	}

	public int getPedidoouro() {
		return pedidoouro;
	}

	public void setPedidoouro(int pedidoouro) {
		this.pedidoouro = pedidoouro;
	}

	public int getPedidomadeira() {
		return pedidomadeira;
	}

	public void setPedidomadeira(int pedidomadeira) {
		this.pedidomadeira = pedidomadeira;
	}

	public int getPedidoagua() {
		return pedidoagua;
	}

	public void setPedidoagua(int pedidoagua) {
		this.pedidoagua = pedidoagua;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOuro() {
		return ouro;
	}

	public void setOuro(int ouro) {
		this.ouro = ouro;
	}

	public int getMadeira() {
		return madeira;
	}

	public void setMadeira(int madeira) {
		this.madeira = madeira;
	}

	public int getAgua() {
		return agua;
	}

	public void setAgua(int agua) {
		this.agua = agua;
	}

}
