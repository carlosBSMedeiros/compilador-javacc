
public class Item {
	private char tipo; // pode ser 'n' (número), 'v' (variável) ou 'o' (operador).
	private String valor; // contém o valor do item

	public Item(char _tipo, String _valor) {
		this.tipo = _tipo;
		this.valor = _valor;
	}

	public char getTipo() {
		return this.tipo;
	}

	public String getvalor() {
		return this.valor;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String toString() {
		return this.valor;
	}
}
