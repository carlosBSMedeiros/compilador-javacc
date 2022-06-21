public class Simbolo {

	private String nome;
	private int referencia;
	private char tipo;
	private char inicializada;
	private static int marcador = 1;

	public Simbolo(String nome, char tipo) {
		this.nome = nome;
		this.tipo = tipo;
		this.referencia = Simbolo.marcador;
		Simbolo.marcador += 2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public char getInicializada() {
		return inicializada;
	}

	public void setInicializada(char inicializada) {
		this.inicializada = inicializada;
	}

	public static int getMarcador() {
		return marcador;
	}

	public static void setMarcador(int marcador) {
		Simbolo.marcador = marcador;
	}

	@Override
	public String toString() {
		return "Simbolo [nome=" + nome + ", referencia=" + referencia + ", tipo=" + tipo + ", inicializada="
				+ inicializada + "]\r\n";
	}

	

}