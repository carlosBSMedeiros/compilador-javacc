import java.util.LinkedList;
import java.util.List;

public class ListaItem {

	private List<Item> lista;
	
	public ListaItem() {
		lista = new LinkedList<Item>();
	}

	public List<Item> getLista() {
		return lista;
	}
	
	public void add(Item i) {
		this.lista.add(i);
	}
	
	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("Expressao formato pos-fixo: [");
		this.lista.forEach(i->{
			strb.append(i.toString()).append(" ");
		});
		strb.append("]");
		return strb.toString();
	}
	
}
